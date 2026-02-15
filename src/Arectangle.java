import java.util.Scanner;

public class Arectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double height=sc.nextDouble();
        double area=length*height;
        System.out.println(area);
    }
}
