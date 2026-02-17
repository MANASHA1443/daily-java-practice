import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            sum=sum+num;
        }
        int avg=sum/n;
        System.out.println(avg);
    }
}
