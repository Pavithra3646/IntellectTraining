/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

package projecteuler;

public class prime_10001 {

	public static void main(String[] args) {
		int i,j,k=15,flag,c;
		for(i=7;i<=10001;i++) {
			flag=0;
			while(flag==0)  {
				c=0;
				for(j=2;j<=k/4;j++) {
					if(k%j==0) {
						c=1;
						break;
					}
					
				}
				k++;
				
				if(c==0)
					flag=1;
				
				
				}
		}
		System.out.println("10001-Prime Number is : "+(k-1));

	}

}
