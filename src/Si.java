import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int T=sc.nextInt();
        int R=sc.nextInt();
        int si=(P*T*R)/100;
        System.out.println("the simple interest is: "+ si);
    }
}
