package homework6.Task2;

import java.util.HashMap;
import java.util.Map;

public class Products {
    public static Map<String,Double> products = new HashMap<>();
    public static void addProducts(){
        products.put("Milk", 1.49);
        products.put("Bread", 1.01);
        products.put("Eggs", 2.67);
        products.put("Juice", 2.75);
        products.put("Cheese", 3.5);
        products.put("Chocolate", 3.45);
        products.put("Cookies", 2.67);
        products.put("Cake", 5.34);
        products.put("Sugar", 1.50);
    }
}
