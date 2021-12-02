package projecteuler;
import java.util.Scanner;
public class WaterMelon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Watermelon weight : ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("\nI get "+n/2+" kgs and my siblings gets "+n/2+" kgs\n");
			for(int i=1;i<n;i++) {
				System.out.println("Possible ways of split = "+i+" and "+(n-i));
			}
		}else
			System.out.println("Sorry you can't buy,look for even weight watermelon");
		
	}

}
