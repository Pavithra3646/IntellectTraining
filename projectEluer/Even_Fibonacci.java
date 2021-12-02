package projecteuler;
import java.util.Scanner;
public class fibonacci {
	static int num1=0,num2=1,nextvalue,sum=0;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		while(nextvalue<4000000) {
			nextvalue=num1+num2;
			num1=num2;
			num2=nextvalue;
			if(nextvalue%2==0)
				sum+=nextvalue;
			
		}
		System.out.println("Fibonacci Even numbers sum = "+sum);

	
	}
}
