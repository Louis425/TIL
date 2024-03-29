package com.mh.restapi03.users;

import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.UsersException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "User-Controller", description = "유저 도회 등록 수정 삭제")
public class UserController {


    /*
        get 사용자 조회
        post 사용자 등록
        put 사용자 수정
        delete 사용자 삭제
     */

    private final UserService userService;

    @Operation(summary = "사용자 전체 목록보기", description = "사용자 전체 정보를 조회 할 수 있습니다.")
    @ApiResponse(
//            {
//                    @ApiResponse(responseCode = "200", description = "ok"),
//                    @ApiResponse(responseCode = "404", description = "사용자들이 없을때 나옵니다!"),
//            }
    )

    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> list = userService.getAllUsers();
        if (list.size() == 0) {
            throw new UsersException(ErrorCode.NOTFOUND);

        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("users/{id}")
    public ResponseEntity<User> getUserById(
            @Parameter(description = "조회하고자 하는 사용자 ID 입력하세요",
                    name = "사용자 ID",
                    required = true)
            @PathVariable Long id) {

        User user = userService.getUserById(id);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody @Valid UserDto userDto) {

        ModelMapper mapper = new ModelMapper();

        User user = UserDto.of(userDto);
        User dbuser = userService.regist(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(dbuser);
    }

    @PutMapping("users")
    public ResponseEntity<User> updateUser(@RequestBody @Valid UserDto userDto){
        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto,User.class);
        user.setWdate(LocalDateTime.now());

        User dbUser = userService.updateUser(user);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbUser);
    }

}