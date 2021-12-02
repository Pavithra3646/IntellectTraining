package projecteuler;

import java.util.Scanner;

public class Expenses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter branding Expenses :");
		double brandingExpenses = sc.nextDouble();
		System.out.print("Enter Travel Expenses");
		double travelExpenses = sc.nextDouble();
		System.out.print("Enter Food Expenses");
		double foodExpenses = sc.nextDouble();
		System.out.print("Enter logistics Expenses:");
		double logisticsExpenses = sc.nextDouble();
		
		double totalExpenses=(brandingExpenses+travelExpenses+foodExpenses+logisticsExpenses);
		System.out.println("\nTotal Expenses : "+totalExpenses);
		double brandingPercentage=(double)(brandingExpenses/totalExpenses)*100;
		System.out.printf("\nBanding percentage :%.2f",brandingPercentage);
		System.out.print("%\n");
		
		
		double tPercentage=(double)(travelExpenses/totalExpenses)*100;
		System.out.printf("Travel percentage :%.2f",tPercentage);
		System.out.print("%\n");
		
		double fPercentage=(double)(foodExpenses/totalExpenses)*100;
		System.out.printf("food percentage : %.2f",fPercentage);
		System.out.print("%\n");
		
		double lPercentage=(double)(logisticsExpenses/totalExpenses)*100;
		System.out.printf("logistics percentage :%.2f",lPercentage);
		System.out.print("%\n");
		


	}

}
