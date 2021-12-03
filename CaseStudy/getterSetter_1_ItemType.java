package case_Studys;
import java.util.Scanner;

class ItemType{

	private String name;
	private double costPerDay;
	private double deposite;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getCostPerDay() {
		return costPerDay;
	}


	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}


	public double getDeposite() {
		return deposite;
	}


	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	void display(String name,double costPerDay,double deposite) {
		this.name=name;
		this.costPerDay=costPerDay;
		this.deposite=deposite;

		System.out.printf("ItemType details\nName="+name);
		System.out.printf("\nCostPerDay=%.2f",costPerDay);
		System.out.printf("\nDeposite=%.2f",deposite);
	}

}


public class Main {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the Item Type : ");
		String name=s.next();
		System.out.println("Enter the Cost per Day: ");
		double costPerDay =s.nextDouble();
		System.out.println("Enter the Depoist:");
		double deposite=s.nextDouble();
		
		ItemType obj= new ItemType();
		obj.display(name,costPerDay,deposite);

	}

}

/*
Sample Input and Output 1:
Enter the item type name
Catering
Enter the cost per day
25000.00
Enter the deposit
10000.50
Item type details
Name : Catering
CostPerDay : 25000.00
Deposit : 10000.50

 */
