import java.util.Scanner;

public class Aisotriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double side=sc.nextDouble();
        double height=Math.sqrt(Math.pow(side,2)-Math.pow(base/2,2));
        double area=base*height;
        System.out.println(area);
    }
}
