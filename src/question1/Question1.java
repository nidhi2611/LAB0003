package question1;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s = s + (1 / i);
        }
        System.out.println(s);
    }

    }
}
