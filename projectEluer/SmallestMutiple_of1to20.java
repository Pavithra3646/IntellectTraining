/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

package projecteuler;

public class oneToTwenty_DivideNumber {

	public static void main(String[] args) {
		
		
		int count=1,i,j;
		for(i=2520;;i++) {
			count=0;
			for(j=1;j<=20;j++) {
				if(i%j!=0)
					break;
				else
				 count++;
			}
			if(count==20) {
				System.out.println("Dividend number of 1 to 20 is : "+i);
				break;
			}
			
			
		}

	}

}
