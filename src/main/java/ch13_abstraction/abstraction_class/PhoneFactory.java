package ch13_abstraction.abstraction_class;

public class PhoneFactory extends Factory{
    private String model;

    // 생성자 및 메서드를 일일히 복사 및 타이핑을 할 필요가 없다.
    // -> 빨간거 뜰 때마다 딸깍딸깍했다.
    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다");
    }
}
