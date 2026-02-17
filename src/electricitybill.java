import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int bill=0;
        if(units<=100){
            bill=units*1;
        }else if(units<=200){
            bill=100*1+(units-100)*2;
        }else if(units<=300){
            bill=100*1+100*2+(units-200)*3;
        }else{
            bill=100*1+100*2+100*3+(units-300)*4;
        }
        System.out.println(bill);
    }
}
