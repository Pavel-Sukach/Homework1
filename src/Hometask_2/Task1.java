package Hometask_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = sc.nextInt();
        System.out.println("Введите число b: ");
        int b = sc.nextInt();
        System.out.println("Введите число r: ");
        double r = (double) sc.nextInt();

        double c = Math.sqrt(a*a + b*b) / 2;

        if(r >= c){
            System.out.println("Можно закрыть отверстие картонкой");
        }
        else {
            System.out.println("Нельзя закрыть отверстие картонкой");
        }
    }
}
