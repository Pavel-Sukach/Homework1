package homework6.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Autosalon {
    public static ArrayList<String> allModels = new ArrayList<>();
    public static Map<Car,Integer> modelQuant = new HashMap<>();

    public static void addCar() throws ModelDoesNotExistException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car model: ");
        String model = scanner.nextLine();

        boolean carAbsent = true;
        for(Map.Entry<Car,Integer> pair : modelQuant.entrySet()){
            if(model.toUpperCase().equals(pair.getKey().carModel.toUpperCase())){
                pair.setValue(pair.getValue() + 1);
                System.out.printf("Now we have one more %s in our salon. Total number for this model is %d.\n\n",pair.getKey().carModel, pair.getValue());
                carAbsent = false;
            }
        }
        if(carAbsent) {
            for(int i = 0; i < Autosalon.allModels.size(); i++){
                if(model.equalsIgnoreCase(Autosalon.allModels.get(i))){
                    carAbsent = false;
                    System.out.println("Enter the description of the car according to the format: \"produced <year>, en.vol <engine volume e.g. 2.0>, <type of the fuel>\": ");
                    String description = scanner.nextLine();
                    Scanner scannerPrice = new Scanner(System.in);
                    System.out.println("Enter the price of the car: ");
                    int price = scannerPrice.nextInt();
                        if(price > 0) {
                            modelQuant.put(new Car(model,description,price),1);
                            System.out.println("New car is successfully added!");
                        }
                        else {
                            System.out.println("Sorry, price cannot be zero or negative! Price is not added!\n");
                        }
                }
            }
            if(carAbsent){
                throw new ModelDoesNotExistException();
            }
        }
    }
    public static void getDescription(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car model you want to get information about: ");

        String model = scanner.nextLine();

        boolean carAbsent = true;
        for(Map.Entry<Car,Integer> pair : modelQuant.entrySet()){
            if(model.toUpperCase().equals(pair.getKey().carModel.toUpperCase())){
                System.out.println(pair.getKey().carModel + " was " + pair.getKey().modelDesc + ".");
                System.out.println();
                carAbsent = false;
            }
        }
        if(carAbsent){
            System.out.println("Sorry, but we do not have this model in our salon!\n");
        }
    }
    public static void buyCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model of the car you want to buy: ");
        String model = scanner.nextLine();
        boolean carAbsent = true;
        for(Map.Entry<Car,Integer> pair : modelQuant.entrySet()){
            if(model.toUpperCase().equals(pair.getKey().carModel.toUpperCase())){
                if(pair.getValue() > 0){
                    pair.setValue(pair.getValue() - 1);
                    System.out.printf("Congratulations! You are a happy owner of %s!\n\n",pair.getKey().carModel);
                }
                else{
                    System.out.printf("Sorry, we've run out of %s.\n\n",model);
                }
                carAbsent = false;
            }
        }
        if(carAbsent){
            System.out.println("Sorry, but we do not have this model in our salon!\n\n");
        }
    }
    public static void showAllCarsList(){
        for (Map.Entry<Car,Integer> pair : modelQuant.entrySet()){
            System.out.printf("We have %d of %s %s. Model costs %d.\n\n", pair.getValue(), pair.getKey().carModel, pair.getKey().modelDesc, pair.getKey().modelPrice);
        }
    }
}
