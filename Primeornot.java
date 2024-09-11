import java.util.Scanner;
import java.lang.Math;
class Primeornot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		int temp=1;
		for(int i=2; i<=Math.sqrt(a); i++)
		{
			if(a%i==0)
			{
				temp=0;
			}
		}
		if(temp==1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}
