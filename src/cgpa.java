import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Subjects: ");
        int n=sc.nextInt();
        double grade,cgpa;
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the grade of subject" + i + ": ");
            grade=sc.nextDouble();
            sum+=grade;
        }
        cgpa=sum/n;
        System.out.println(cgpa);
    }
}
