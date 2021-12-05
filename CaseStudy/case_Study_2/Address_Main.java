package case_Studys;
import java.util.InputMismatchException;
import java.util.Scanner;
class Task_Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer pincode;

	Task_Address(){

	}
	Task_Address(String addressLine1, String addressLine2, String city,String state, Integer pincode){
		this.addressLine1=addressLine1;
		this.addressLine2=addressLine2;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return addressLine1 +"\n"+addressLine2+"\n"+city+"\n"+state+"\n"+pincode;

	}

}



public class Main4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		Task_Address ad = null;
		ad=new Task_Address();

		try {
			System.out.println("Enter Address Line 1: ");
			ad.setAddressLine1(sc.nextLine());
			System.out.println("Enter Address Line 2: ");
			ad.setAddressLine2(sc.nextLine());
			System.out.println("Enter the City Name: ");
			ad.setCity(sc.nextLine());
			System.out.println("Enter the State Name: ");
			ad.setState(sc.nextLine());
			System.out.println("Enter the Pincode: ");
			ad.setPincode(sc.nextInt());


			System.out.println("The Address Details are\n"+ad.toString());
		}
		catch(InputMismatchException exception) {
			System.out.println("Input is valid!!! Give valid input");
		}
	} 


}

/*

Enter Address Line 1
22nd Lane
Enter Address Line 2
8th cross road, RR nagar
Enter the City Name
Chennai
Enter the State Name
Tamilnadu
Enter the Pincode
620001
The Address Details are
22nd Lane
8th cross road, RR nagar
Chennai
Tamilnadu
620001

 */
