import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double INR=sc.nextDouble();
        double rate=83.0;
        double USD=INR/rate;
        System.out.println(USD);
    }
}
