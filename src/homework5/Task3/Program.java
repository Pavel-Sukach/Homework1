package homework5.Task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Integer[] typeInt = new Integer[]{1, 3, 4, 6, 8, 9};
        DifTypes<Integer> typeIntObj = new DifTypes<>(typeInt);
        Long[] typeLong = new Long[]{223452345234342l, 3234523523452345l, 434563564567l, 6239485723848l, 892837642984782l, 92986928336723l};
        DifTypes<Long> typeLongObj = new DifTypes<>(typeLong);
        Double[] typeDouble = new Double[]{1.43, 3.75, 4.456, 6.563, 8.234, 9.434};
        DifTypes<Double> typeDoubleObj = new DifTypes<>(typeDouble);
        String[] typeString = new String[]{"Test1", "Test2", "Test3", "Test4", "Test5", "Test6"};
        DifTypes<String> typeStringObj = new DifTypes<>(typeString);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of data you want to get: ");
        String type = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the index number: ");
        int num = sc1.nextInt();

        switch (type.toUpperCase()){
            case "INTEGER": int a = typeIntObj.getElementByIndex(num);
                System.out.println(a);
            break;
            case "LONG": long b = typeLongObj.getElementByIndex(num);
                System.out.println(b);
            break;
            case "DOUBLE": double c = typeDoubleObj.getElementByIndex(num);
                System.out.println(c);
            break;
            case "STRING": String s = typeStringObj.getElementByIndex(num);
                System.out.println(s);
            break;
            default:
                System.out.println("You've entered incorrect type.");
        }
    }
}
