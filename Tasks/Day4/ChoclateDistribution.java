package projecteuler;
import java.util.Scanner;
public class chocolateDistribution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number of choclate : ");
		int noOfChocolate=sc.nextInt();
		System.out.println("Enter Number of Children :");
		int noOfchildren=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=noOfChocolate;i++) {
			noOfChocolate-=i;
			count++;
		}
		System.out.println("\nNumber of Chocolate left : "+noOfChocolate);
		System.out.println("Number of Childrens got Chocolate : "+count);

	}

}
