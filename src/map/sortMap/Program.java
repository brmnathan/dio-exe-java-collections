package map.sortMap;

public class Program {
    public static void main(String[] args) {
        Book book1 = new Book("Ready Player One", 2011, "Ernest Cline", 45.90, "https://www.amazon.com.br/dp/8535927161");
        Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", 1979, "Douglas Adams", 39.90, "https://www.amazon.com.br/dp/0345391802");
        Book book3 = new Book("Neuromancer", 1984, "William Gibson", 49.90, "https://www.amazon.com.br/dp/0441569595");
        Book book4 = new Book("Snow Crash", 1992, "Neal Stephenson", 55.90, "https://www.amazon.com.br/dp/0553380958");
        Book book5 = new Book("The Lord of the Rings: The Fellowship of the Ring", 1954, "J.R.R. Tolkien", 65.90, "https://www.amazon.com.br/dp/0547928211");
        Book book6 = new Book("The Lord of the Rings: The Two Towers", 1954, "J.R.R. Tolkien", 65.90, "https://www.amazon.com.br/dp/0547928203");
        Book book7 = new Book("The Lord of the Rings: The Return of the King", 1955, "J.R.R. Tolkien", 65.90, "https://www.amazon.com.br/dp/054792819X");
        Book book8 = new Book("Dune", 1965, "Frank Herbert", 60.90, "https://www.amazon.com.br/dp/0441013597");
        Book book9 = new Book("1984", 1949, "George Orwell", 35.90, "https://www.amazon.com.br/dp/0451524934");
        Book book10 = new Book("Coraline", 2002, "Neil Gaiman", 29.90, "https://www.amazon.com.br/dp/0380807343");

        try{
            BookStore bookStore = new BookStore();
            //Add books
            bookStore.addBook("978-0307887443", book1);
            bookStore.addBook("978-0345391803", book2);
            bookStore.addBook("978-0441569595", book3);
            bookStore.addBook("978-0553380958", book4);
            bookStore.addBook("978-0547928210", book5);
            bookStore.addBook("978-0547928203", book6);
            bookStore.addBook("978-0547928197", book7);
            bookStore.addBook("978-0441013593", book8);
            bookStore.addBook("978-0451524935", book9);
            bookStore.addBook("978-0380807345", book10);
            //Remove book
            bookStore.removeBook("978-0451524935");
            //Display books by Price
            System.out.println(bookStore.getBookCatalogByPrice().toString());
            //Display books by Author
            System.out.println(bookStore.getBookCatalogByAuthor("J.R.R. Tolkien"));
            //Display most expensive book
            System.out.println(bookStore.getMostExpensiveBook());
            //Display cheapest book
            System.out.println(bookStore.getCheapestBook());
        }
        catch (BookStoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
