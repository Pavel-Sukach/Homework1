package Hometask_2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int START_VAR = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        boolean isSimple = recursion(number, START_VAR);
        if(isSimple){
            System.out.printf("Is number %d simple - YES", number);
        }
        else {
            System.out.printf("Is number %d simple - NO", number);
        }
    }
    private static boolean recursion(int n, int i) {

        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
}
