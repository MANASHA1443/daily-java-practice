import java.util.Scanner;

public class amst2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rem,sum=0;
        while(n>0){
            rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        if(sum==original){
            System.out.println("amstrong");
        }else{
            System.out.println(" not amstrong");
        }
    }
}
