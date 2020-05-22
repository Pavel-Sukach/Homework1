package homework6.Task2;

import java.util.ArrayList;

public class Customer {
    private ArrayList<String> listOfPurchases;


    public Customer(ArrayList<String> listOfPurchases) {
        this.listOfPurchases = listOfPurchases;
    }
    public static ArrayList<String> processPurch(String purchases){
        ArrayList<String> list = new ArrayList<>();
        String[] purchasesArr = purchases.replaceAll(" ","").split(",");
        for(int i = 0; i < purchasesArr.length; i++){
            list.add(purchasesArr[i]);
        }
        return list;
    }
}
