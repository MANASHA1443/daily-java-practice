import java.util.Scanner;

public class pythogoreanf11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(Ispythogorean(num1,num2,num3)){
            System.out.println("it is pythagorean triplet");
        }else{
            System.out.println("it is not pythagorean triplet");
        }
    }
    static boolean Ispythogorean(int num1,int num2,int num3){
        int max=Math.max(num1,Math.max(num2,num3));
        int x,y;
        if(max==num1){
            x=num2;
            y=num3;
        }else if(max==num2){
            x=num1;
            y=num3;
        }else{
            x=num1;
            y=num2;
        }
        return (x*x+y*y)==max*max;
    }
}
