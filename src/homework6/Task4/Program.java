package homework6.Task4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Autosalon.allModels.add("Audi 100");
        Autosalon.allModels.add("Opel Insignia");
        Autosalon.allModels.add("Nissan X-Trail");
        Autosalon.allModels.add("BMW X3");
        Autosalon.allModels.add("Renault Stepway");
        Autosalon.allModels.add("Volkswagen Passat");
        Autosalon.allModels.add("Ford Mondeo");
        Autosalon.allModels.add("Kia Rio");
        Autosalon.allModels.add("Lada Kalina");
        Autosalon.allModels.add("Mersedes Benz");
        Autosalon.allModels.add("Subaru Forester");
        Autosalon.allModels.add("Citroen C3");
        Autosalon.allModels.add("Peugeot 3008");


        Autosalon.modelQuant.put(new Car("Audi 100","produced 2019, en.vol 2.0, gasoline", 17000),1);
        Autosalon.modelQuant.put(new Car("Opel Insignia","produced 2020, en.vol 1.8, diesel", 21000),1);
        Autosalon.modelQuant.put(new Car("Nissan X-Trail","produced 2018, en.vol 2.4, gasoline", 33000),1);
        Autosalon.modelQuant.put(new Car("BMW X3","produced 2020, en.vol 2.0, gasoline", 28000),1);
        Autosalon.modelQuant.put(new Car("Renault Stepway","produced 2017, en.vol 1.6, gas", 15000),1);
        Autosalon.modelQuant.put(new Car("Volkswagen Passat","produced 2020, en.vol 1.8, gasoline", 24000),1);
        Autosalon.modelQuant.put(new Car("Ford Mondeo","produced 2016, en.vol 1.4, diesel", 16500),1);
        Autosalon.modelQuant.put(new Car("Toyota Camry","produced 2019, en.vol 2.0, gasoline", 33000),1);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hi! If you want to add a car enter 1,");
            System.out.println("if you want to receive information about a car we have enter 2,");
            System.out.println("if you want to buy a car enter 3,");
            System.out.println("if you want to receive information about all our models enter 4.");

            int a = 0;
            try {
                a = scanner.nextInt();

                switch (a) {
                    case 1:
                        try {
                            Autosalon.addCar();
                        } catch (ModelDoesNotExistException e) {
                            e.modelDoesNotExist();
                        }
                        break;
                    case 2:
                        Autosalon.getDescription();
                        break;
                    case 3:
                        Autosalon.buyCar();
                        break;
                    case 4:
                        Autosalon.showAllCarsList();
                        break;
                    default:
                        System.out.println("Please, enter a number from 1 to 4!\n");
                }
            } catch (Exception e) {
                System.out.println("Please, enter a number from 1 to 4!\n");
            }
        }
    }
}
