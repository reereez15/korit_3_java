package ch16_bean.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@AllArgsConstructor
public class Personlombok {
    @NonNull            // 필드 레빌의 애너테이션
    private final String name;      // 얘는 비울 수 없다는 뜻
    private int age;

    // 이상의 경우 동일하게 private final String name을 했을 때
    // 오류가 발생했지만. ALT + ins가 아니라 lombok을 통해서 해결

    // RequiredArgsConstructor는 final을 감지해서
    // 걔가 포함되어 있는 매개변수 생성자를 자동으로 만들어줍니다.

    // 그리고 @Data로 수정했습니다. -> RequiredArgsConstructor / setter / getter / ToString

    @Override
    public String toString(){
        return "이름 : " + name + "\n나이 : " + age;
    }

    // ch17_static, Product.java / ProductMain.java

}
