import java.util.Scanner;

public class amst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
