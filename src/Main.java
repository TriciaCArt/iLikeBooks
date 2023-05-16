import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("I want a book!");

        Book myBook = new Book();

        myBook.getTitle();
        myBook.getAuthor();
        myBook.getPublicationYear();
        myBook.toString();
        System.out.println(myBook);

        System.out.println("MORE!");

        Book herBook = new Book("Lyons Pride", "Anne McCaffrey", 1994);
        herBook.toString();
        System.out.println(herBook);

        System.out.println("What book do you want?");
        Book nowBook = new Book();
        nowBook.setTitle("Damans Children");
        nowBook.setAuthor("Anne McCaffrey");
        nowBook.setPublicationYear(1993);
        nowBook.toString();
        System.out.println(nowBook);

        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(nowBook);
        listOfBooks.add(myBook);
        listOfBooks.add(herBook);
        listOfBooks.toString();
        System.out.println(listOfBooks);

    }
}