import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private Integer publicationYear;

    public Book(){
        title = "Gone With The Wind";
        author = "Margaret Mitchell";
        publicationYear = 1936;
    }

    public Book (String title, String author, Integer publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "The title of the book you are looking for is " + title + "." + " This book " +
                "was written by " + author + " in the year " + publicationYear + ".\n";
    }
}
