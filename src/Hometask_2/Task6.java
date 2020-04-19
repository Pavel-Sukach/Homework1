package Hometask_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        task6();
    }
    public static void task6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();

        int[][] doubleDimArray = new int[n][n];

        for (int i = 0; i < doubleDimArray.length; i++){
            for(int j = 0; j < doubleDimArray[0].length; j++){
                doubleDimArray[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < doubleDimArray.length; i++){
            for (int j = 0; j < doubleDimArray[0].length; j++) {
                if ((doubleDimArray[i][j] % 2) > 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            if(i < (n - 1)) {
                System.out.println();
                System.out.println();
            }
        }
    }
}
