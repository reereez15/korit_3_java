package ch12_inheritance.products;
/*
    item 클래스에
    1. field 선언 private String namem, private String category
    2. AllArgsConstructor를 생성하세요(필드 전체를 다 사용하는 생성자)
    3. setter / getter
    4. Product.java에서 Item - 부모클래스 / Product - 자식 클래스
 */
public class Item {
    private String name;
    private String category;

    //생성자
    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }
    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}
