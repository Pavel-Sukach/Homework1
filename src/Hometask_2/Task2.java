package Hometask_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = sc.nextInt();

        if (n > 0 && n < 10) {
            switch (n) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default: {
                    System.out.println("Введенное число не соответствует дню недели");
                }
            }
        }
    }
}
