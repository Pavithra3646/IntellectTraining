package projecteuler;
import java.util.Scanner;
public class runrate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number Of Overs=");
		int totalovers = sc.nextInt();
		
		System.out.print("Enter Total Runs=");
		int total_runs = sc.nextInt();
		
		System.out.print("Enter Number Of Overs Bowled=");
		int no_ofover_bowled = sc.nextInt();
		System.out.print("Enter Number Runs Scored So Far:");
		int run_far = sc.nextInt();
		
		float currentrun_rate=run_far/no_ofover_bowled;
		System.out.println("Current Run Rate : "+currentrun_rate);
		
		float run_rate=(float)(total_runs-run_far)/(float)(totalovers-no_ofover_bowled);
		System.out.println("Required Run Rate :"+run_rate);
		
		
		
	}

}
