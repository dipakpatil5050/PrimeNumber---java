package company.pratian;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Check if it is Prime or Not : ");

        int n = sc.nextInt();
        int count = 0;
        for (int i=1; i<=n;i++ ){
            if (n%i  == 0)
                count++;
        }

if (count == 2) {
    System.out.println(" Yes the Entered number is Prime Number........1");
}else {
    System.out.println(" No the Entered number is Not Prime NUmber........0");
}
    }
}
