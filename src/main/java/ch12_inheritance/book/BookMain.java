package ch12_inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Book book2 = new Book("남궁성", "자바의 정석");
        System.out.println("이 책의 제목은 " + book2.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book2.getAuthor() + "입니다.");

        Ebook ebook1 = new Ebook("이강준", "스프링 입문", 5.2, "EPUB");
        ebook1.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + ebook1.getFormat() + "입니다.");

        ebook1.displayInfo();
    }
}
