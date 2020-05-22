package homework7.task2;

import java.io.*;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string: ");
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        try (FileOutputStream fos = new FileOutputStream("src/Testfile_task2.txt");
             BufferedReader br = new BufferedReader(new FileReader("src/Testfile_task2.txt"))) {
            byte[] buffer = sb.toString().getBytes();
            fos.write(buffer,0,buffer.length);
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
