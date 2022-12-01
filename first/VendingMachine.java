import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products; // = new ArrayList<>();
    private final static List<Product> initProduct = new ArrayList<>();


    public VendingMachine() {

        this(initProduct);
    }

    public VendingMachine(List<Product> prods) {
        this.products = prods;
    }

    public VendingMachine(String name, Double price) {
        this.products = new ArrayList<>();
        products.add(new Product(name, price));
    }

    public Product getProductBy(String inpName) {
        for (Product product : products) {
            if (product.getName().contains(inpName)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductBy(Double inpName) {
        for (Product product : products) {
            if (product.getPrice().equals(inpName)) {
                return product;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String result ="";
        for (Product product : products) {
            result = result.concat(product.toString());
        }
        return result;
    }

}