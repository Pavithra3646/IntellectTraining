/*
The sum of the squares of the first ten natural numbers is, 1^2+2^2+...+10^2=385

The square of the sum of the first ten natural numbers is,  (1+2+3+...+10)^2=3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .  3025-385=2640

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
package projecteuler;
import java.util.Scanner;
public class Square_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number : ");
		int n=sc.nextInt(); 
		
		int i,j;
		int sumOfNumberSquare=(n*(n+1)*(2*n+1))/6;
		double squareOFSum=Math.pow(((n*(n+1))/2),2);
		
		System.out.print("Difference between sum of natural numbers square and square of natural numbers sum : ");
		System.out.print((int)squareOFSum-sumOfNumberSquare);
		
	}

}
