package homework4.hm4_task3;

import java.util.Scanner;

public class CelsiusConverter implements Converter {
    @Override
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        float celVal = scanner.nextFloat();
        float farVal = (celVal * 9/5) + 32;
        float kelVal = celVal - 273.15f;
        System.out.printf("%.2f градуса по Цельсию - это %.2f по Фаренгейту и %.2f по Кельвину.", celVal, farVal, kelVal);
    }
}
