package map.searchMap;

public class Program {
    public static void main(String[] args) {
        Product p1 = new Product("Smartphone", 799.99, 15);
        Product p2 = new Product("Laptop", 1299.99, 10);
        Product p3 = new Product("Headphones", 99.99, 20);
        Product p4 = new Product("Smartwatch", 249.99, 12);
        Product p5 = new Product("Tablet", 499.99, 8);
        Product p6 = new Product("TV", 899.99, 5);
        Product p7 = new Product("Gaming Console", 399.99, 7);
        Product p8 = new Product("Wireless Earbuds", 149.99, 18);
        Product p9 = new Product("Camera", 599.99, 9);
        Product p10 = new Product("Printer", 299.99, 6);

        Stock stock = new Stock();

        //Add products
        stock.addProduct(93847637L, p1);
        stock.addProduct(85746395L, p2);
        stock.addProduct(97463547L, p3);
        stock.addProduct(75847465L, p4);
        stock.addProduct(89657463L, p5);
        stock.addProduct(23459876L, p6);
        stock.addProduct(45362738L, p7);
        stock.addProduct(23443256L, p8);
        stock.addProduct(32166754L, p9);
        stock.addProduct(76213348L, p10);
        //Remove product
        stock.removeProduct(76213348L);
        //Display products
        stock.displayStock();
        //Display the cheapest product
        System.out.println(stock.getCheapestProduct());
        //Display the most expensive product
        System.out.println(stock.getMostExpensiveProduct());
        //Stock total value
        System.out.println("Stock total value: " + stock.getStockTotalValue());
    }
}
