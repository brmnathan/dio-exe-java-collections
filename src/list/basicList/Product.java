package list.basicList;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product: " + name
                + ", Price: " + price
                + ", Quantity: " + quantity;
    }
}
