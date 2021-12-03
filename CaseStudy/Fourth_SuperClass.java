package case_Studys;
import java.util.InputMismatchException;
import java.util.Scanner;

class Address{
	private String street;
	private String city;
	private int pincode;
	Address(){}

	Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return street+","+city+"-"+pincode;
	}
}
class Customer{
	String name;
	Address address;
	Customer(){}
	
	Customer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name+" "+address.toString();
	}

}
public class Main2 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		Customer1 custobj=new Customer1();
		Address Addressobj=new Address();
		try {
		
			System.out.println("Enter the name");
			custobj.setName(s.next());	
			System.out.println("Enter the Address Details\nEnter the Street");
			Addressobj.setStreet(s.next());
			System.out.println("Enter the city");
			Addressobj.setCity(s.next());
			System.out.println("Enter the pincode");
			Addressobj.setPincode(s.nextInt());

			custobj.setAddress(Addressobj);
			System.out.println(custobj);



		}
		catch(InputMismatchException exception) {
			System.out.println("Given value is not valid!!! Please give valid input");
		}


	}

}


/*
Sample Input and Output:

Enter the name
Yuva
Enter the Address Details
Enter the street
222,Willington
Enter the city
Thiruchi
Enter the pincode
3254125
Yuva 222,Willington,Thiruchi-3254125
*/
