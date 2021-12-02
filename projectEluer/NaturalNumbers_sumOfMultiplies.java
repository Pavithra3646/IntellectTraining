package projecteuler;
import java.util.Scanner;

public class naturalnumbers {
	static int sum=0;
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++) {
			
			 if(i%3==0 || i%5==0)
				sum+=i;
			
		}
		System.out.println(sum);

	}

}
