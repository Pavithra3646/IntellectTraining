package case_Studys;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		Customers[] customersObj =new Customers[100];
		Customers[] duplicateCustomers = new Customers[100];
		Customers customer1 = null;
		Address address = null;
		int customersObjCount = 0,duplicateCustomersCount = 0,i=0,j;

		try  {
			System.out.println("Enter the number of customers");
			customersObjCount = s.nextInt();

			while (i < customersObjCount) {
				customer1 = new Customers();
				address = new Address();

				System.out.printf("Enter the Customer Details %d \n", i + 1);
				System.out.println("Enter the name");
				customer1.setName(s.next());

				System.out.println("Enter the street");
				address.setStreet(s.next());

				System.out.println("Enter the city");
				address.setCity(s.next());

				System.out.println("Enter the pincode");
				address.setPincode(s.nextInt());

				customer1.setAddress(address);
				customersObj[i] = customer1;
				i++;

			} 

			for (i = 0; i < customersObjCount; i++) {
				for ( j = i + 1; j < customersObjCount; j++) {
					if (customersObj[i].equals(customersObj[j])) {
						duplicateCustomers[duplicateCustomersCount++] = customersObj[i];
					}
				}
			}

			if (duplicateCustomers[0] == null) {
				System.out.println("No duplicate details");
			} else {
				System.out.println("The identical Customers Details:");

				for (i = 0; i < duplicateCustomersCount; i++) {
					System.out.println((i + 1) + ")" + duplicateCustomers[i]);
				}
			}

		} catch (InputMismatchException exception) {
			System.err.println("Given input is not valid!!! Please give valid input");

		}

	}
}


/*
Enter number of customers
3
Enter the Customer Details 1
Enter the name
Arun
Enter the Address Details
Enter the street
22,absur street
Enter the city
SBC
Enter the pincode
852147
Enter the Customer Details 2
Enter the name
Bob
Enter the Address Details
Enter the street
65,Phusra road
Enter the city
MAS
Enter the pincode
963256
Enter the Customer Details 3
Enter the name
Arun
Enter the Address Details
Enter the street
22,absur street
Enter the city
SBC
Enter the pincode
852147

The identical Customer Details:
1)Name:Arun
Address:22,absur street,SBC-852147
*/
