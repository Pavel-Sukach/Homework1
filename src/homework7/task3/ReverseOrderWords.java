package homework7.task3;

import java.util.Scanner;

public class ReverseOrderWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
