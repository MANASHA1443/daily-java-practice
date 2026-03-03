import java.util.Scanner;

public class primef7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (prime(num)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
    }
        return true;
    }
}

