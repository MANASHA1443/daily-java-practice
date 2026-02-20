import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amt: ");
        double p=sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r=sc.nextDouble();
        System.out.println("Enter the time: ");
        int t=sc.nextInt();
        double pa=1+r/100;
        double amount=p*Math.pow(pa,t);
        System.out.println(amount);
        double fin=amount-p;
        System.out.println(fin);
    }
}
