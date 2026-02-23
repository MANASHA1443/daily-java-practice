import java.util.Scanner;

public class negpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumofneg = 0;
        int sumofevenpos = 0;
        int sumofoddpos = 0;
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                sumofneg += n;
            }
            if(n>0){
                if(n%2==0){
                    sumofevenpos+=n;
                }
                else{
                    sumofoddpos+=n;
                }
            }
        }
        System.out.println(sumofneg);
        System.out.println(sumofevenpos);
        System.out.println(sumofoddpos);
    }
}
