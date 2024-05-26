package map.sortMap;

import java.util.Comparator;
import java.util.Map;

public class Book implements Comparable<Book>{
    private String title;
    private int publicationYear;
    private String author;
    private double price;
    private String amazonLink;

    public Book(String title, int publicationYear, String author, double price, String amazonLink) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
        this.price = price;
        this.amazonLink = amazonLink;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getAmazonLink() {
        return amazonLink;
    }

    @Override
    public int compareTo(Book other) {
        return title.compareTo(other.getTitle());
    }

    @Override
    public String toString() {
        return "Book: " + title
                + ", Author: " + author
                + ", Publication Year: " + publicationYear
                + ", Price: " + price
                + ", Amazon link: " + amazonLink;
    }
}

class ComparatorByPrice implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        return Double.compare(b1.getValue().getPrice(), b2.getValue().getPrice());
    }
}

class ComparatorByAuthor implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        return b1.getValue().getAuthor().compareToIgnoreCase(b2.getValue().getAuthor());
    }
}
