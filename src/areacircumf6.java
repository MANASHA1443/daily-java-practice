import java.util.Scanner;

public class areacircumf6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        circle(r);
    }
    static void circle(int r){
        int area=1;
        int circum=1;
        area=(int)3.14*r*r;
        circum=(int)((int)2*3.14*r);
        System.out.println("the area is: "+area);
        System.out.println("the circumference is: "+circum);
    }
}
