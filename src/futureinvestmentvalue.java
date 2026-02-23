import java.util.Scanner;

public class futureinvestmentvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double rate=sc.nextDouble();
        rate=rate/100;
        int years=sc.nextInt();
        double partial=1+rate;
        double finalvalue=p*Math.pow(partial,years);
        System.out.println(finalvalue);
    }
}
