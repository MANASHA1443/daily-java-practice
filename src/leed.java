import java.util.Scanner;

public class leed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int rem = n%10;
            sum += rem;
            prod *= rem;
            n=n/10;
        }
        System.out.println("Product of digits: " + prod);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Result: "+(prod-sum));
    }
}






