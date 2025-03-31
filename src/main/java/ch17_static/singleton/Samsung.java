package ch17_static.singleton;

import lombok.Getter;

/*
    방금 작성한 ProductView와 chrome에서의 레퍼런스를 참조하여
    Samsung 클래스를 싱글톤 패턴으로 작성하시오.
 */
public class Samsung {
    // 정적 변수
    private static Samsung instance;
    // 멤버 변수
    @Getter     // getCompany
    private String company;
    private int serialNunber;

    private Samsung(){
        company = getClass().getSimpleName();
        serialNunber = 20250000;
    }

    public static Samsung getInstance(){
        if (instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNunber(String model){
        return model + "_" + ++serialNunber;
    }

}
