package homework7.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void checkIp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the IP");
        String str = in.nextLine();
        if (Pattern.matches("^(([01]?[0-9][0-9]?|25[0-5]|2[0-4][0-9])\\.){3}([01]?[0-9][0-9]?|25[0-5]|2[0-4][0-9])$", str))
            System.out.println("This is a valid IP");
        else System.out.println("Invalid input");
    }

    public static void checkDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the date in format: YYYY/MM/DD HH:MM:SS");
        String date = in.nextLine();
        if (Pattern.matches("^(([0-1][0-9][0-9][0-9])|(20[0-1][0-9]))/(1[0-2]|0[1-9])/(0[1-9]|[1-2][0-9]|3[0-1])\\s(2[0-4]|[0-1][0-9]):([0-5][0-9]):([0-5][0-9])$", date)) {
            if (Pattern.matches("^(([0-1][0-9][0-9][0-9])|(20[0-1][0-9]))/(04|06|09|11)/31\\s(2[0-4]|[0-1][0-9]):([0-5][0-9]):([0-5][0-9])$", date)) //verification for 31 day in some month
            {
                System.out.println("Invalid date");
            } else if (Pattern.matches("^(([0-1][0-9][0-9][0-9])|(20[0-1][0-9]))/02/(30|31)\\s(2[0-4]|[0-1][0-9]):([0-5][0-9]):([0-5][0-9])$", date)) { //February
                System.out.println("Invalid date");
            } else {
                System.out.println("You've entered a valid date!");
            }
        } else {
            System.out.println("Invalid date");
        }
    }

    public static void checkUrl(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter URL (enter space before submitting)");
        String url = in.nextLine();
        if (Pattern.matches("^(http|https)://(www.)?([a-z]{3,}.)?[a-z]{3,}.[a-z]{2,}/? $", url)) {
            System.out.println("Valid url");
        } else {
            System.out.println("Invalid url");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to check your IP address,");
        System.out.println("Enter 2 to check that your date corresponds with the format,");
        System.out.println("Enter 3 to check your url is correct: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Your input is incorrect!");
        }

        switch (a){
            case 1: checkIp();
                break;
            case 2: checkDate();
                break;
            case 3: checkUrl();
                break;
            default:
                System.out.println("Please, enter 1, 2, or 3!");
        }
    }
}
