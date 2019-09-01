package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0.0;
        double k = 0.0;
        for (int i = 1; i <= n; i++) {
            s = (1 / i);
            k = k + s;
        }
        System.out.println(k);
    }

    }

