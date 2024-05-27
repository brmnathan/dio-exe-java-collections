package map.sortMap;

import java.util.*;

public class BookStore {
    Map<String, Book> bookCatalog;

    public BookStore() {
        this.bookCatalog = new HashMap<>();
    }

    public void addBook(String isbn, Book book) {
        bookCatalog.put(isbn, book);
    }

    public void removeBook(String isbn) {
        bookCatalog.remove(isbn);
    }

    public Map<String, Book> getBookCatalogByPrice() {
        List<Map.Entry<String, Book>> booksToSort = new ArrayList<>(bookCatalog.entrySet());
        booksToSort.sort(new ComparatorByPrice());
        Map<String, Book> booksByPrice = new LinkedHashMap<>();

        for (Map.Entry<String, Book> entry : booksToSort)
            booksByPrice.put(entry.getKey(), entry.getValue());

        if (booksByPrice.isEmpty())
            throw new BookStoreException("Error: The book catalog is empty!");
        else
            return booksByPrice;
    }

    public Map<String, Book> getBookCatalogByAuthor(String author) {
        List<Map.Entry<String, Book>> booksToSort = new ArrayList<>(bookCatalog.entrySet());
        booksToSort.sort(new ComparatorByAuthor());
        Map<String, Book> booksByAuthor = new LinkedHashMap<>();

        for (Map.Entry<String, Book> entry : booksToSort)
            if (entry.getValue().getAuthor().equals(author))
                booksByAuthor.put(entry.getKey(), entry.getValue());

        if (booksByAuthor.isEmpty())
            throw new BookStoreException("Error: There are no books from the author: " + author);
        else
            return booksByAuthor;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensiveBook = null;
        double mostExpensivePrice = Double.MIN_VALUE;

        for (Book b : bookCatalog.values()) {
            if (b.getPrice() > mostExpensivePrice) {
                mostExpensiveBook = b;
                mostExpensivePrice = b.getPrice();
            }
        }

        if (mostExpensiveBook == null)
            throw new BookStoreException("Error: Book not found!");
        else
            return mostExpensiveBook;
    }

    public Book getCheapestBook() {
        Book cheapestBook = null;
        double cheapestPrice = Double.MAX_VALUE;

        for (Book b : bookCatalog.values()) {
            if (b.getPrice() < cheapestPrice) {
                cheapestBook = b;
                cheapestPrice = b.getPrice();
            }
        }

        if (cheapestBook == null)
            throw new BookStoreException("Error: Book not found!");
        else
            return cheapestBook;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : bookCatalog.entrySet())
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        return sb.toString();
    }
}
