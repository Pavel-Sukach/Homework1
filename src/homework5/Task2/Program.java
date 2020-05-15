package homework5.Task2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        Letters.getLetterPosition(scanner.nextLine().toUpperCase());
    }
}
