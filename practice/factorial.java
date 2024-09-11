package practice;
import java.util.Scanner;


public class factorial {
    public static void main(Strings[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int s=sc.nextInt();
        int n=1;

        for (int i = 1; i <= s; i++) {
            n= n*i;
        }
        System.out.println("Factorial is: "+n);
    }
}
