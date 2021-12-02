package projecteuler;

import java.util.Scanner;

public class Target_Turns {
	static int target=100;

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		
		int trun=0,count=0;
		System.out.println("Enter turns count : ");
		while(sc.hasNext()) {
		
			trun+=sc.nextInt();
			count++;
			if(trun>=target) {
				break;
				 
			}else
				System.out.println("Enter turns count : ");
			
		}
		System.out.print("Number of Truns :"+count);

	}

}
