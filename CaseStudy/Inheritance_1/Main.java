package Inheritance_1;
import java.util.Scanner; 
class Account {
	protected String accName;
	protected String accNo;
	protected String bankName;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	void display() {
		//System.out.println("Account Details : "+accName+" "+accNo+" "+bankName);
	}

}
 class CurrentAccount extends Account {
	private String tinNumber;
	CurrentAccount(){}
	CurrentAccount(String accName,String accNo,String bankName,String tinNumber){
		super();
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		this.tinNumber=tinNumber;
	}
	
	public String getTinNumber() {
		return tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	void display() {
		
	}
	@Override
	public String toString() {
		return "Account Name:" + accName + "\nAccount Number:" + accNo + "\nBank Name:"
				+ bankName+"\nTin Number:"+tinNumber;
	}

}
 
 class SavingsAccount extends Account {
 	private String orgName;
 	SavingsAccount(){}
 	
 	SavingsAccount(String accName,String accNo,String bankName,String orgName){
 		super();
 		this.accName=accName;
 		this.accNo=accNo;
 		this.bankName=bankName;
 		this.orgName=orgName;
 	}

 	public String getOrgName() {
 		return orgName;
 	}

 	public void setOrgName(String orgName) {
 		this.orgName = orgName;
 	}
 	
 	void display() {
 		
 	}

 	@Override
 	public String toString() {
 		return "Account Name:" + accName + "\nAccount Number:" + accNo + "\nBank Name:"
 				+ bankName+"\nOrganisation Name:"+orgName;
 	}

 }



public class Main {
 static Scanner sc=new Scanner(System.in);
  
	public static void main(String[] args) {
		
		System.out.println("Choose Account Type\r\n"
				+ "1.Savings Account\r\n"
				+ "2.Current Account");
		int number=sc.nextInt();
		
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			
			String ArrayString=sc.next();
			String[] result = ArrayString.split(",");
		    String accName = result[0];
		    String accNo = result[1];
		    String bankName = result[2];
		   
			if(number==1) {
				String orgName=result[3];
				SavingsAccount sObj=new SavingsAccount(accName,accNo,bankName,orgName);
				System.out.println(sObj.toString());

			
		}else {
			String tinNumber=result[3];
			CurrentAccount cObj=new CurrentAccount(accName,accNo,bankName,tinNumber);
			System.out.println(cObj.toString());
			
		}

	}

}

/*

Choose Account Type
1.Savings Account
2.Current Account
1
Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)
Morsh,033808020000879,Baroda,Amphisoft
Account Name:Morsh
Account Number:033808020000879
Bank Name:Baroda
Organisation Name:Amphisoft
*/
