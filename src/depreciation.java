import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double original=sc.nextDouble();
        double scrap=sc.nextDouble();
        int years=sc.nextInt();
        double dep=original-scrap;
        double deperyear=dep/years;
        double finalprice=original-(deperyear*years);
        System.out.println(finalprice);
    }
}
