package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
    /*
        UserEntity 클래스의 인스턴스 user1을 생성하고,
        Username에 1
        Password 9876
        Email   a@test.com
        Name에 여러분 이름을 입력한 뒤에
        toString()을 이용해 콘솔에 출력하시오
     */

        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("김준식");
        System.out.println(user1);
    /*
        Username에 2
        Password 1357
        Email   b@test.com
        Name에 김이을 입력한 뒤에

        getter을 활용하여
        username : 2
        password : 1357
        email : b@test.com
        이름 : 김이
     */
        UserEntityLombok user2 = new UserEntityLombok();

        user2.setUsername(2);
        user2.setPassword(1357);
        user2.setEmail("b@test.com");
        user2.setName("김이");

        System.out.println("username : " + user2.getUsername());
        System.out.println("password : " + user2.getPassword());
        System.out.println("email : " + user2.getEmail());
        System.out.println("이름 : " + user2.getName());

    }
}
