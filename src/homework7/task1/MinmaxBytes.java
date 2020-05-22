package homework7.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MinmaxBytes {
    public static void maxByte(String fileName) throws IOException {
        try(FileInputStream fin = new FileInputStream(fileName)) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer,0,fin.available());
            Arrays.sort(buffer);
            System.out.println(buffer[buffer.length-1]);
        }
    }
    public static void minByte(String fileName) throws IOException{
        try(FileInputStream fin = new FileInputStream(fileName)) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer,0,fin.available());
            Arrays.sort(buffer);
            System.out.println(buffer[0]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        Scanner scannerInt = new Scanner(System.in);
        System.out.println("If you want to see the biggest byte enter 1, if you want to see the smallest byte enter 2: ");
        int maxMin = scannerInt.nextInt();

        try {
            switch (maxMin){
                case 1: maxByte(fileName);
                break;
                case 2: minByte(fileName);
                break;
                default:
                    System.out.println("You are allowed to enter only 1 or 2!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
