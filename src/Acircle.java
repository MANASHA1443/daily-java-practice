import java.util.Scanner;

public class Acircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("the area of circle: "+ area);
    }
}
