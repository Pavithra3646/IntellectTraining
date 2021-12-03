package case_Studys;

import java.util.Scanner;

class Customer{

	String customerName;
	String customerEmail;
	String customerType;
	String customerAddress;


	 Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
		
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerAddress = customerAddress;
	}


	public void displayDetails(){

		System.out.println("\nName:"+customerName);
		System.out.println("E-mail:"+customerEmail);
		System.out.println("Type:"+customerType);
		System.out.println("Location:"+customerAddress);

	}
}
public class Main1{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	{
			
		
		System.out.println("\nEnter the Customer Details");
		System.out.println("Enter the name");
		String customerName = s.nextLine();
		System.out.println("Enter the email");
		String customerEmail=s.nextLine();
		System.out.println("Enter the type");
		String customerType=s.nextLine();
		System.out.println("Enter the location");
		String customerAddress=s.nextLine();

		Customer customerObj = new Customer(customerName,customerEmail,customerType,customerAddress);
		customerObj.displayDetails();		 

	}

}

/*
Sample Input and Output 2:

Enter the Customer Details
Enter the name
Kate
Enter the email
kate@a.com
Enter the type
Domestic
Enter the location
Australia
Name: Kate
E-mail: kate@a.com
Type: Domestic
Location: Australia
*/
