package ch12_inheritance.products;

public class Product extends Item{
    private int price;
    private int stock;

    //  부모의 속성과 자식의 속성을 전부 다 입력해야 하는 AllArgsConstructor를 생성하시오
    public Product(String name, String category, int stock, int price) {
        super(name, category);
        this.stock = stock;
        this.price = price;
    }
    // 부모 속성의 settr / getter
    public Product(String name, String category) {
        super(name, category);
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }
    // 자식 속성의 setter / getter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 이상까지의 코드를 작성했을 때 ProductMain에서 할 수 있는 것
    // 1. 객체 생성을 필드를 전부 초기화 했을 때 할 수 있음.
    // 2. 부모 속성이든 자식 속성이든 상관없이 setter / getter

    // 고유 메서드
    public void displayInfo(){
        System.out.println("제품명 : " + this.getName());
        System.out.println("카테고리 : " + this.getCategory());     //부모 클래스긴 한데 서로 다른 클래스인데다가 private이라서.
        System.out.println("가격 : " + price);        // 같은 클래스라서 private이라도 상관없음.
        System.out.println("재고 : " + stock);
    }


}
