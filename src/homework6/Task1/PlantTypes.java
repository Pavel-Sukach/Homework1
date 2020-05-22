package homework6.Task1;

import java.util.*;

public class PlantTypes {
    public static Map<String,String> plants = new HashMap<>();

    public static Set<String> types = new HashSet<>();
    public static void showAllTypes(){
        for(Map.Entry<String,String> pair : plants.entrySet()) {
            types.add(pair.getValue());
        }
                for(String type : types){
                    System.out.print("К типу " + type + " относятся: ");
                    StringBuilder sb = new StringBuilder("");
                    for(Map.Entry<String, String> pair1 : plants.entrySet()){
                        if(type.equals(pair1.getValue())){
                            sb.append(pair1.getKey() + ", ");
                        }
                    }
                    String str = sb.toString();
                    System.out.println(str.substring(0,str.length()-2) + ".");
                }
            }

    public static void showTypeOfPlant(String plant){
        boolean noResult = true;
        for(Map.Entry<String,String> pair : plants.entrySet()){
            if(pair.getKey().toUpperCase().equals(plant)){
                System.out.printf("%s - это %s.", pair.getKey(), pair.getValue());
                noResult = false;
            }
        }
        if(noResult){
            System.out.println("Тип растения введен неправильно либо такого растения нет в нашей базе.");
        }
    }

    public static void main(String[] args) {
        plants.put("Вишня", "Ягода");
        plants.put("Слива", "Ягода");
        plants.put("Фундук", "Орех");
        plants.put("Кешью", "Орех");
        plants.put("Свекла", "Корнеплод");
        plants.put("Картофель", "Корнеплод");
        plants.put("Батат", "Корнеплод");
        plants.put("Фасоль", "Бобовые");
        plants.put("Горох", "Бобовые");

        Scanner sc = new Scanner(System.in);
        System.out.println("Если хотите узнать все типы растений с примерами, введите 1.");
        System.out.println("А если хотите узнать тип конкретного растения, то введите 2.");


        int a = 0;

        try {
            a = sc.nextInt();
            if(a == 1) {
                showAllTypes();
            }
            else if(a == 2){
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Введите название растения, тип которого хотите узнать: ");
                showTypeOfPlant(sc1.nextLine().toUpperCase());
            }
            else{
                System.out.println("Можно вводить только 1 или 2!");
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
