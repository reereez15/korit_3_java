package ch12_arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] mathscores = { 60, 20, 48, 56, 58, 80, 95, 100, 50, 36, 78, 95, 84, 53};

        // 그럼 이제 Array06에 정의된 메서드를 사용하여
        // 총합과 평균에 grade당 인원수들을 출력하시오.
        Array06 array06 = new Array06();
        array06.printTotalInfo(mathscores);
    }
}
