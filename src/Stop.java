import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            String s=sc.next();
            if(s.equals("x")){
                break;
            }
            int num=Integer.parseInt(s);
            sum=sum+num;
        }
        System.out.println(sum);
    }

}
