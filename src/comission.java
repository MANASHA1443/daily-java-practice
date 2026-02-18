import java.util.Scanner;

public class comission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sales=sc.nextDouble();
        double percent=sc.nextDouble();
        double commission=(sales*percent)/100;
        System.out.println(commission);
    }
}
