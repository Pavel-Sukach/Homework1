package homework4.hm4_task3;

import java.util.Scanner;

public class KelvinConverter implements Converter{
    @Override
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        float kelVal = scanner.nextFloat();
        float celVal = kelVal + 273.15f;
        float farVal = (celVal * 9/5) + 32;
        System.out.printf("%.2f градуса по Кельвину - это %.2f по Цельсию и %.2f по Фаренгейту.", kelVal, celVal, farVal);
    }
}
