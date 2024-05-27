package list.basicList;

public class Program {
    public static void main(String[] args) {
        Product tv = new Product("TV", 1, 2500.0);
        Product iPhone = new Product("iPhone", 2, 8000.0);
        Product book = new Product("The Lord of The Rings", 3, 120.0);
        Product bike = new Product("BMX", 1, 1600.0);

        try {
            ShoppingCart shoppingCart = new ShoppingCart();

            //Add Products
            shoppingCart.addProduct(tv);
            shoppingCart.addProduct(iPhone);
            shoppingCart.addProduct(book);
            shoppingCart.addProduct(bike);
            //Remove Product by name
            shoppingCart.removeProduct("BMX");
            //Display Products in the Cart
            shoppingCart.displayProducts();
            //Display Total Cart Value
            System.out.println(shoppingCart.calculateCartValue());
        }
        catch (ShoppingException e) {
            System.out.println(e.getMessage());
        }
    }
}
