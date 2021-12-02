package projecteuler;
import java.util.Scanner;
public class luckycustomers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int date=sc.nextInt();
		int billnum=sc.nextInt();
		
		
	if(date>0 && date<=31) {
		if(date==(billnum)%100 || date==(billnum)%10 || (billnum%date==0))
		
		    System.out.print("Lucky Customer");
	
		else 
			System.out.print("Not a Lucky Customer");		
	}
	else
		System.out.println("Given date is not valid");
		

	}

}
