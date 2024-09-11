package scanner;
import java.util.Scanner;

/*
import java.util.Scanner;

Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
String s=sc.next();
String p=sc.nextLine();
*/

public class ScannerInput {
    public static void main(String[] args) {

        //for strings
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname=sc.next();
        System.out.println(fname);
        String lname=sc.nextLine();
        System.out.println(fname);

        //for integers
        System.out.println("Enter a number");
        int i=sc.nextInt();
        System.out.println(i);

    }

}
