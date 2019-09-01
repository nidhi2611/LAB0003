package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        int rs = 0;
        rs = (int) m;
        System.out.println(rs + "rupees and " + (int) ((m - rs) * 100) + " paisa");


    }
}
