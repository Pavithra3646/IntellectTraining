package projecteuler;

import java.util.Scanner;

public class ratings_average {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of people who watched show 1 :");
		int show1=s.nextInt();
		System.out.println("Enter the average rating for show 1 : ");
		float show1_rating=s.nextFloat();
		
		System.out.println("Enter the number of people who watched show 2 :");
		int show2=s.nextInt();
		System.out.println("Enter the average rating for show 2 : ");
		float show2_rating=s.nextFloat();
		
		System.out.println("Enter the number of people who watched show 3 :");
		int show3=s.nextInt();
		System.out.println("Enter the average rating for show 3 : ");
		float show3_rating=s.nextFloat();
		
		float total_noof_people=show1+show2+show3;
		float total_ratings=((float)(show1_rating*show1)+(show2_rating*show2)+(show3_rating*show3))/total_noof_people;
		System.out.printf("\nTotal Ratings : %.2f",total_ratings);

	}

}
