package ch00_Review01;

class Data {
    private int intDate;
    private String strData;
    // Getter / Setter 같이 만들겠습니다
    // main에서 data1 객체 생성하시고
    // setter를 통해서 intData에 1750 입력
    // strData 에 "집가는 시간!!!!!!!" 입력
    // getter를 활용하여
    // 실행 예
    // 오늘 1750은 집가는 시간!!!!!
    // 이 출력되도록 작성하시오.
    public int getIntDate() {
        return intDate;
    }
    public void setIntDate(int intDate) {
        this.intDate = intDate;
    }
    public String getStrData() {
        return strData;
    }
    public void setStrData(String strData) {
        this.strData = strData;
    }
}
public class Review10 {

    public static void main(String[] args) {
        Data data1 = new Data();
        // setter를 통한 값 입력
        data1.setIntDate(1750);
        data1.setStrData("집가는 시간!!!!");
        System.out.println("오늘 " + data1.getIntDate() + "은 " + data1.getStrData());
    }
}
