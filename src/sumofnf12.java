import java.util.Scanner;

public class sumofnf12 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ans=sum(n);
       System.out.println(ans);
    }
    static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
