package projecteuler;
import java.util.Scanner;
public class weekhours_calculate {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the total salary paid : ");
	float salary=s.nextFloat();
	float weekend_days=(float)(salary-800)/130;
	
	System.out.printf("Number of weekend hours is : %.2f\n",weekend_days);
	System.out.printf("Number of weekday hours is :%.2f",(float)(salary-(weekend_days)*50)/80.00);

	}

}
