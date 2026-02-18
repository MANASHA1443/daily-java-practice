import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2;
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        double dx=x2-x1;
        double dy=y2-y1;
        double distance=Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
        System.out.println(distance);
    }
}
