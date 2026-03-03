import java.util.Scanner;

public class votef4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
    }
    static void eligible(int age){
        if(age>=18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }
    }
}
