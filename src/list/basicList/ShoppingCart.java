package list.basicList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    List<Product> shoppingCart;

    public ShoppingCart(){
        this.shoppingCart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        shoppingCart.add(product);
    }

    public void removeProduct(String nameToRemove) {
        if (shoppingCart.isEmpty())
            throw new ShoppingException("The Shopping Cart is Empty!");
        else
            shoppingCart.removeIf(p -> Objects.equals(p.getName(), nameToRemove));
    }

    public String calculateCartValue() {
        double cartValue = 0;
        for (Product p : shoppingCart)
            cartValue += p.getTotalValue();
        return "Total value: " + cartValue;
    }

    public void displayProducts() {
        if (shoppingCart.isEmpty())
            throw new ShoppingException("The Shopping Cart is Empty!");
        else
            for (Product p : shoppingCart)
                System.out.println(p);
    }
}
