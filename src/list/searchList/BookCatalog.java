package list.searchList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookCatalog {
    List<Book> bookCatalog;

    public BookCatalog() {
        this.bookCatalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookCatalog.add(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book b : bookCatalog) {
            if (b.getAuthor().equalsIgnoreCase(author))
                booksByAuthor.add(b);
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearInterval(int initialYear, int finalYear) {
        List<Book> booksByYearInterval = new ArrayList<>();
        for (Book b : bookCatalog) {
            if (initialYear <= b.getPublicationYear() && finalYear >= b.getPublicationYear())
                booksByYearInterval.add(b);
        }
        return booksByYearInterval;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;
        if (bookCatalog.isEmpty())
            throw new BookCatalogException("The Catalog is Empty");
        else {
            for (Book b : bookCatalog) {
                if (b.getTitle().equalsIgnoreCase(title))
                    bookByTitle = b;
            }
        }
       return bookByTitle;
    }
}
