package homework4.hm4_task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название шкалы в которой представлено значение, которое вы вводите. Например, Цельсий, Фаренгейт, Кельвин: ");
        String scale = scanner.nextLine();
        scale = scale.toUpperCase();

        switch (scale){
            case "ЦЕЛЬСИЙ":
                FahrenheitConverter fcc = new FahrenheitConverter();
                KelvinConverter kcc = new KelvinConverter();
                Scanner scan_cel = new Scanner(System.in);
                System.out.println("Введите значение: ");
                float celVal = scan_cel.nextFloat();
                fcc.convert(celVal, scale);
                System.out.println();
                kcc.convert(celVal, scale);
                break;
            case "ФАРЕНГЕЙТ":
                CelsiusConverter ccf = new CelsiusConverter();
                KelvinConverter kcf = new KelvinConverter();
                Scanner scan_fahr = new Scanner(System.in);
                System.out.println("Введите значение: ");
                float fahrVal = scan_fahr.nextFloat();
                ccf.convert(fahrVal,scale);
                System.out.println();
                kcf.convert(fahrVal,scale);
                break;
            case "КЕЛЬВИН":
                CelsiusConverter cck = new CelsiusConverter();
                FahrenheitConverter fck = new FahrenheitConverter();
                Scanner scan_kel = new Scanner(System.in);
                System.out.println("Введите значение: ");
                float kelVal = scan_kel.nextFloat();
                cck.convert(kelVal,scale);
                System.out.println();
                fck.convert(kelVal,scale);
                break;
                default:
                    System.out.println("Неправильно введено название системы. Попробуй еще раз!");
        }
    }
}
