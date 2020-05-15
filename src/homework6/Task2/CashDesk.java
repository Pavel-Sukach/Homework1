package homework6.Task2;


import java.util.ArrayList;
import java.util.Map;

public class CashDesk {
    public static void processCustomer(Customer customer){
        ArrayList<String> list = customer.listOfPurchases;
        float sumToPay = 0;
        for(int i = list.size()-1; i >= 0; i--){
            for(Map.Entry<String,Double> pair : Products.products.entrySet()){
                if(list.get(i).toUpperCase().equals(pair.getKey().toUpperCase())){
                    sumToPay += pair.getValue();
                }
            }
            list.remove(i);
        }
        if(sumToPay == 0){
            System.out.println("Maybe your cart is empty or check if you've entered data correctly!");
        }
        else {
            System.out.printf("You have to pay %.2f rubles", (float) sumToPay);
        }
    }
}
