package hello.itemservice.web.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor // 생성자만들어서 오토와이어드하는거를 생략 할수있다
public class BasicItemController {

    private final ItemRepository itemRepository;

//    상품목로
    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "basic/items";
    }


//    상품상세
@GetMapping("/{itemId}")
public String item(@PathVariable Long itemId, Model model) {
    Item item = itemRepository.findById(itemId);
    model.addAttribute("item", item);
    return "basic/item";
}

    @GetMapping("/add")
    public String addForm() {
        return "/basic/addForm";
    }

//    @PostMapping("/add")
    public String addItemV1(@RequestParam String itemName,
                       @RequestParam int price,
                       @RequestParam Integer quantity,
                       Model model) {

//        위에 있는 파라미터가 오면 아이템 인스턴스를 생성해서
        Item item = new Item();

//        파라미터로 넘어온 데이터를 아이템 인스턴스에 넣고
        item.setItemName(itemName);
        item.setPrice(price);
        item.setQuantity(quantity);

//        아이템레포지토리 쩜 세이브를 불러서 아이탬 인스턴스를 아규먼트에 넣은다
        itemRepository.save(item);

        model.addAttribute("item", item);

        return "basic/item";
    }

//    @PostMapping("/add")
//    골뱅이 모델어트리뷰트 쓰면 아이템을 인스턴스를 생성하고 요청 파라미터의 값을 프로퍼티 접근법(setXxx)으로 입력해준다.
//    그리고 골뱅이 모델어트리뷰트 소괄호에 인스턴스에 이름을 넣으면 자동으로 인스턴스 값을 모델 넣어준다
//    그리고 또 아규먼트에 있는 Model model 없에도 된다               , Model model
    public String addItemV2(@ModelAttribute("item") Item item) {

//        한 다리로 골뱅이 모델어트리뷰트 쓰면 이거 안써도 됨
//        위에 있는 파라미터가 오면 아이템 인스턴스를 생성해서
//        Item item = new Item();

//        파라미터로 넘어온 데이터를 아이템 인스턴스에 넣고
//        item.setItemName(itemName);
//        item.setPrice(price);
//        item.setQuantity(quantity);

//        아이템레포지토리 쩜 세이브를 불러서 아이탬 인스턴스를 아규먼트에 넣은다
        itemRepository.save(item);

//        model.addAttribute("item", item); //자동 추가, 생략 가능

        return "basic/item";
    }

//    @PostMapping("/add")
//    골뱅이 모델어트리뷰트 소괄호를 안적으면 디포드룰로 Item -> item 넘겨준다 앞을자를 소문자로 만들어 준다
    public String addItemV3(@ModelAttribute Item item) {

        itemRepository.save(item);
//        model.addAttribute("item", item); //자동 추가, 생략 가능
        return "basic/item";
    }

//    @PostMapping("/add")
    public String addItemV4(Item item) {
        itemRepository.save(item);
        return "basic/item";
    }

//    PRG Post/Redirect/Get 적용!
//   @PostMapping("/add")
    public String addItemV5(Item item) {
        itemRepository.save(item);
       return "redirect:/basic/items/" + item.getId();
    }

 @PostMapping("/add")
    public String addItemV6(Item item, RedirectAttributes redirectAttributes) {
     Item savedItem = itemRepository.save(item);
     redirectAttributes.addAttribute("itemId", savedItem.getId());
     redirectAttributes.addAttribute("status",true);
     return "redirect:/basic/items/{itemId}";
    }

//    상품 수정 폼
    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/editForm";
    }

//    상품 수정 처리
    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId, @ModelAttribute Item item) {
        itemRepository.update(itemId, item);
        return "redirect:/basic/items/{itemId}";
    }

    /**
     * 테스트용 데이터 추가
     */

//    @PostMapping// 포스트매핑으로 사용해서 갑들이 화면에 안떳음......
//    다음에는 잘 확인하도록 하자.....

    @PostConstruct
    public void init() {

        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
    }

}
