import java.util.Scanner;

public class batting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int runs=sc.nextInt();
        int outs=sc.nextInt();
        int avg=runs/outs;
        System.out.println(avg);
    }
}
