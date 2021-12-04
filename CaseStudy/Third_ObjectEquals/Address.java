package case_Studys;
import java.util.Objects;

public class Address {
	private String street;
	private String city;
	private int pincode;

	public Address() {
	}

	public Address(String street, String city, int pincode) {
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Address otheraddress = (Address) obj;
		return Objects.equals(city, otheraddress.city) && Objects.equals(pincode, otheraddress.pincode)
				&& Objects.equals(street, otheraddress.street);
	}

	@Override
	public String toString() {
		return street + "," + city + "-" + pincode;
	}

}

/*
Enter number of customers
2
Enter the Customer Details 1
Enter the name
Chintu
Enter the Address Details
Enter the street
22,Barathi-part 1
Enter the city
kerala
Enter the pincode
9887546
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

No duplicate details
*/
