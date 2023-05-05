package Oops;

public class Books {
    String bookname;
    String authorname;
    String whichdateyoupickthebook;

    public void display() {
        System.out.println("book name:"+bookname);
        System.out.println();
        System.out.println("author name:"+authorname);
        System.out.println();
        System.out.println("which date you pick the book:"+whichdateyoupickthebook);
    }

}
class det {
    public static void main(String[] args) {
        Books detalies = new Books();
        detalies.bookname = "life of bird";
        detalies.authorname = "tamil";
        detalies.whichdateyoupickthebook = "2.3.2023";
detalies.display();
    }
}
