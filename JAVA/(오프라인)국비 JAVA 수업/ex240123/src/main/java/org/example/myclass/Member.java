package org.example.myclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor  // 생성자를 자동으로 만들어준다. 그렇기에 new 선언할때 매개변수 적어야 한다.
@ToString
public class Member {

    private String name;
    private int age;

}
