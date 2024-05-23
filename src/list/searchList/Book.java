package list.searchList;

public class Book {
    private String title;
    private int publicationYear;
    private String author;

    public Book(String title, int publicationYear, String author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title
                + ", Author: " + author
                + ", Publication Year: " + publicationYear;
    }
}
