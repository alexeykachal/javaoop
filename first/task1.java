import java.util.*;


public class task1 {
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Масло", 50.0));
        prods.add(new Product("Шоколад", 30.0));
        prods.add(new Product("Снек", 20.0));
        prods.add(new Milk("Домик", 30.0, 2));
        prods.add(new Nuts("Peanut", 70.0, 400.0 ));
        prods.add(new Nuts("Pistachios", 200.0, 355.0 ));


        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Чипсы"));

    }
    
}
