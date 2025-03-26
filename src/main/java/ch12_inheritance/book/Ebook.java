package ch12_inheritance.book;

public class Ebook extends Book{
    private double fileSize;
    private String format;

    public Ebook(String author, String title, double fileSize, String format) {
        super(author, title);
        this.fileSize = fileSize;
        this.format = format;
    }
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Ebook(String author, String title) {
        super(author, title);
    }
    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    public void displayInfo(){
        Book book1 = new Book("남궁성","자바의정석" );
        System.out.println("제목 : " + this.getTitle());
        System.out.println("저자 : " + this.getAuthor());
        System.out.println("파일 크기 : " + fileSize);
        System.out.println("파일 형식 : " + format);
    }

}
