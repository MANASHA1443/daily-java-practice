import java.util.Scanner;

public class Aequilateraltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println(area);
    }
}
