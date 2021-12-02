package projecteuler;
import java.util.Scanner;
public class primefactors {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		long  n=s.nextLong(),i;
		long max=0;
		int f;
		
		for( i=2;i<=n/2;i++) {
			if(n%i==0) {
				f=0;
				for(long j=2;j<=i/4;j++) {
					if(i%j==0) {
						f=1;
						break;
					}
				}
				if(f==0)
					max=i;
			}
			
		}
	
	   System.out.println("Largest prime factor : "+max);

	}

}
