package ch12_arrays;

public class Array10 {
    public static void main(String[] args) {
        String[] persons = { "강수림", "기준성", "김미선", "김준식",
                "문성진", "심민호", "양지은", "유지현", "윤현지", "이동규",
                "이예은", "이정화", "전용남", "채주원", "한영진"};
        /*
            1번 : 강수림 님
            2번 : 기준성 님
            ...
            15번 : 한영진 님
         */
        // 일반 for 문
        for (int i = 0 ; i < persons.length ; i++){
            System.out.println((i+1) + "번 : " + persons[i] + "님");
        }
        System.out.println();
        // 향상된 for 문
        int number = 1;
        for (String person : persons){
            System.out.println(number + "번 : " + person + "님");
            number++;
        }


    }
}
