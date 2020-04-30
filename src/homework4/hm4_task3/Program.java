package homework4.hm4_task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название шкалы в которой представлено значение, которое вы вводите. Например, Цельсий, Фаренгейт, Кельвин: ");
        String scale = scanner.nextLine();

        switch (scale.toUpperCase()){
            case "ЦЕЛЬСИЙ":
                CelsiusConverter sc = new CelsiusConverter();
                sc.convert();
                break;
            case "ФАРЕНГЕЙТ":
                FahrenheitConverter fc = new FahrenheitConverter();
                fc.convert();
                break;
            case "КЕЛЬВИН":
                KelvinConverter kc = new KelvinConverter();
                kc.convert();
                break;
                default:
                    System.out.println("Неправильно введено название системы. Попробуй еще раз!");
        }
    }
}
