package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = 0.0;
        c = (f - 32) / 1.8;
        System.out.print(c);
    }

}
