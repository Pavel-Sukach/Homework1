package homework4.hm4_task3;

import java.util.Scanner;

public class FahrenheitConverter implements Converter{
    @Override
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        float farVal = scanner.nextFloat();
        float celVal = (farVal - 32)*5/9;
        float kelVal = celVal - 273.15f;
        System.out.printf("%.2f градуса по Фаренгейту - это %.2f по Цельсию и %.2f по Кельвину.", farVal, celVal, kelVal);
    }
}
