import java.util.Scanner;

public class f5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=multiply(num1,num2);
        System.out.println("the product is: "+ans);
    }
    static int multiply(int num1,int num2){
        int prod=1;
        prod=num1*num2;
        return prod;
    }
}
