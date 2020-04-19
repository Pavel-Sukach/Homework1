package Hometask_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        task4();
    }
    public static void task4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение длинны массива n :");
        int n = sc.nextInt();
        if(n < 3){
            System.out.println("Введите число побольше");
        }
        else {
            int[] vec = new int[n];
            for (int i = 0; i < vec.length; i++) {
                vec[i] = (int) ((Math.random() * 30) - 15);
            }

            int sum_neg = 0;
            for (int k = 0; k < vec.length; k++) {
                if (vec[k] < 0) {
                    sum_neg += vec[k];
                }
            }
            System.out.println("Сумма отрицательных элементов вектора: " + sum_neg);

            Arrays.sort(vec);

            int vec_elem_mult = vec[1];
            for (int l = 2; l < vec.length - 1; l++) {
                vec_elem_mult *= vec[l];
            }
            System.out.println("произведение элементов вектора, расположенных между максимальным и минимальным элементами: " + vec_elem_mult);
        }
    }
}
