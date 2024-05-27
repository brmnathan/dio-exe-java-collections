package list.searchList;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        Book book1 = new Book("Ready Player One", 2011, "Ernest Cline");
        Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", 1979, "Douglas Adams");
        Book book3 = new Book("Neuromancer", 1984, "William Gibson");
        Book book4 = new Book("Snow Crash", 1992, "Neal Stephenson");
        Book book5 = new Book("The Lord of the Rings: The Fellowship of the Ring", 1954, "J.R.R. Tolkien");
        Book book6 = new Book("The Lord of the Rings: The Two Towers", 1954, "J.R.R. Tolkien");
        Book book7 = new Book("The Lord of the Rings: The Return of the King", 1955, "J.R.R. Tolkien");
        Book book8 = new Book("Dune", 1965, "Frank Herbert");
        Book book9 = new Book("1984", 1949, "George Orwell");
        Book book10 = new Book("Coraline", 2002, "Neil Gaiman");

        try {
            BookCatalog bookCatalog = new BookCatalog();

            //Add Books to Catalog
            bookCatalog.addBook(book1);
            bookCatalog.addBook(book2);
            bookCatalog.addBook(book3);
            bookCatalog.addBook(book4);
            bookCatalog.addBook(book5);
            bookCatalog.addBook(book6);
            bookCatalog.addBook(book7);
            bookCatalog.addBook(book8);
            bookCatalog.addBook(book9);
            bookCatalog.addBook(book10);

            //Search by Author
            String author = "J.R.R. Tolkien";
            List<Book> booksByAuthor = bookCatalog.searchByAuthor(author);
            System.out.println("Books by: " + author);
            for (Book b : booksByAuthor)
                System.out.println(b);

            //Search by YearInterval
            int initialYear = 1990;
            int finalYear = 2010;
            List<Book> booksByYearInterval = bookCatalog.searchByYearInterval(initialYear, finalYear);
            System.out.println("Books from " + initialYear + " to " + finalYear);
            for (Book b : booksByYearInterval)
                System.out.println(b);

            //Search by Title
            String title = "Dune";
            System.out.println("Book matching the title: " + title);
            System.out.println(bookCatalog.searchByTitle(title));
        }
        catch (BookCatalogException e) {
            System.out.println(e.getMessage());
        }
    }
}
