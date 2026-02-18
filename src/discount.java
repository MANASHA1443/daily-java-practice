import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        double discountpercent=sc.nextDouble();
        double discountamount=(price*discountpercent)/100;
        double finalprice=price-discountamount;
        System.out.println(discountamount);
        System.out.println(finalprice);
    }
}
