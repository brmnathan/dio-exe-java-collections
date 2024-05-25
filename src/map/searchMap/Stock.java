package map.searchMap;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    Map<Long, Product> stock;

    public Stock() {
        this.stock = new HashMap<>();
    }

    public void addProduct(Long id, Product product) {
        stock.put(id, product);
    }

    public void removeProduct(Long id) {
        stock.remove(id);
    }

    public void displayStock() {
        if (stock.isEmpty())
            throw new StockException("The stock is empty!");
        else
            System.out.println(toString());
    }

    public double getStockTotalValue() {
        double sum = 0d;
        if (stock.isEmpty())
            throw new StockException("The stock is empty!");
        else
            for (Product p : stock.values())
                sum += p.getProductTotalValue();
        return sum;
    }

    public Product getMostExpensiveProduct() {
        Product product = null;
        double mostExpensive = Double.MIN_VALUE;
        if (stock.isEmpty())
            throw new StockException("The stock is empty!");
        else
            for (Product p : stock.values()) {
                if (p.getPrice() > mostExpensive) {
                    mostExpensive = p.getPrice();
                    product = p;
                }
            }
        return product;
    }

    public Product getCheapestProduct() {
        Product product = null;
        double cheapest = Double.MAX_VALUE;
        if (stock.isEmpty())
            throw new StockException("The stock is empty!");
        else
            for (Product p : stock.values()) {
                if (p.getPrice() < cheapest) {
                    cheapest = p.getPrice();
                    product = p;
                }
            }
        return product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Long, Product> entry : stock.entrySet())
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        return sb.toString();
    }
}
