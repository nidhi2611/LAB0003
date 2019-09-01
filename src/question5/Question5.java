package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int y2 = year % 100;
        int y1 = year / 100;
        int f = 0;
        f = date + ((13 * month - 1) / 5) + y2 + (y2 / 4) + (y1 / 4) - 2 * y1;


    }

}
