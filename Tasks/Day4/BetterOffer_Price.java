package projecteuler;
import java.util.Scanner;
public class BetterOffer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter product 1 price : ");
		 float price1=s.nextInt();
		System.out.print("Enter product 2 price : ");
		 float price2=s.nextInt();
	    System.out.print("Enter product 3 price : ");
		 float price3=s.nextInt();
		
		bestOffer(price1,price2,price3);
		
		

	}
	static  void bestOffer(float a,float b,float c) {
		
		double total=(double)a+b+c;
		double offer1=(total*0.2);
		double offer2=(a<b && a<c)?a:(b<c)?b:c;
		
		offer1=total-offer1;
		offer2=total-offer2;
		
		if(offer1>offer2) 
			System.out.printf("\nOFFER-1= %.2f \nOFFER-2=%.2f\nOffer-2 is best for customer",offer1,offer2);
		else
			System.out.printf("\nOFFER-1= %.2f \nOFFER-2=%.2f\nOffer-1 is best for customer",offer1,offer2);
		
	}

}
