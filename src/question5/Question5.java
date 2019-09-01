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
        int day = f % 7;
        if (day < 0)
            day = day + 7;
        else
            day = day;
        if (day == 0)
            System.out.println("Sunday");
        else if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");

    }
}




