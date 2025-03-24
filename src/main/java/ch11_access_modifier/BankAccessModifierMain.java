package ch11_access_modifier;

import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        // 테스트용 객체 생성
//        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(1234567,"김일",
//                10000, 1234);
//        Scanner scanner = new Scanner(System.in);
//
//        int pin = 0;
//
//        bankAccessModifier1.showInfo();
//        bankAccessModifier1.deposit(1000, 3214);    // 입금하는데 비밀번호 틀리면
//        System.out.println(bankAccessModifier1.getBalance());      // 입금 되지않았는지 확인
//        bankAccessModifier1.deposit(-10,1234);      // 입금하는데 음수값
//        System.out.println(bankAccessModifier1.getBalance());      // 입금 되지않았는지 확인
//        bankAccessModifier1.deposit(2000, 134);
//        pin = scanner.nextInt();
//        bankAccessModifier1.deposit(3000,pin);
//        bankAccessModifier1.withdraw(3000,1234);

        BankAccessModifier bank1 = new BankAccessModifier(123456789,
                "홍길동", 100000, 1234);
        BankAccessModifier bank2 = new BankAccessModifier(987654321,
                "신사임당", 500000, 4321);

        bank1.deposit(50000,1234);
        bank1.withdraw(200000,1234);
        bank1.withdraw(100000,1234);
        System.out.println();
        bank2.withdraw(100000,4321);
        bank2.deposit(200000,4321);
        System.out.println();
        System.out.println("최종 계좌 정보");
        bank1.showInfo();
        System.out.println();
        bank2.showInfo();

    }
}
