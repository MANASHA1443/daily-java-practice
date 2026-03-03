import java.util.Scanner;

public class f3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=add(num1,num2);
        System.out.println(ans);
    }
    static int add(int num1,int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }
}
