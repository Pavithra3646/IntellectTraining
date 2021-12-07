package Inheritance_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class SilverStall {
	protected String name;
	protected String detail;
	protected String owner;
	protected Integer cost;

	public SilverStall() {
	}

	public SilverStall(String name, String detail, String owner, Integer cost) {
		this.name = name;
		this.detail = detail;
		this.owner = owner;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Stall Name:"+name+"\nDetails:"+detail+"\nOwner Name:"+owner;
	}

}

class GoldStall extends SilverStall {
	private Integer tvSet;

	public GoldStall() {
	}

	public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet) {
		super(name, detail, owner, cost);
		this.tvSet = tvSet;
	}

	public Integer getTvSet() {
		return tvSet;
	}

	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append("\nTV Sets:")
				.append(tvSet)
				.toString();
	}

}
class PlatinumStall extends GoldStall {
	private Integer projector;

	public PlatinumStall() {
	}

	public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector) {
		super(name, detail, owner, cost, tvSet);
		this.projector = projector;
	}

	public Integer getProjector() {
		return projector;
	}

	public void setProjector(Integer projector) {
		this.projector = projector;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append("\nProjectors:")
				.append(projector)
				.toString();
	}

}


public class Main {
	static  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {

		int totalCost = 0;
		String[] input = null;

		try {
			System.out.println("Choose Stall Type\n1.Silver Stall\n2.Gold Stall\n3.Platinum Stall");

			int choice = s.nextInt();

			switch(choice) {
			case 1:
			{
				SilverStall silverStall = new SilverStall();
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");

				input = bufferedReader.readLine().split(",");

				silverStall.setName(input[0]);
				silverStall.setDetail(input[1]);
				silverStall.setOwner(input[2]);
				silverStall.setCost(Integer.parseInt(input[3]));

				totalCost = silverStall.getCost();
				System.out.println(silverStall);
				break;

			} 
			case 2:{

				GoldStall goldStall = new GoldStall();

				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");

				input = bufferedReader.readLine().split(",");

				goldStall.setName(input[0]);
				goldStall.setDetail(input[1]);
				goldStall.setOwner(input[2]);
				goldStall.setCost(Integer.parseInt(input[3]));
				goldStall.setTvSet(Integer.parseInt(input[4]));

				totalCost = goldStall.getCost() + (goldStall.getTvSet() * 100);

				System.out.println(goldStall);
				break;
			} 
			case 3:{
				PlatinumStall platinumStall = new PlatinumStall();

				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");

				input =bufferedReader.readLine().split(",");
				platinumStall.setName(input[0]);
				platinumStall.setDetail(input[1]);
				platinumStall.setOwner(input[2]);
				platinumStall.setCost(Integer.parseInt(input[3]));
				platinumStall.setTvSet(Integer.parseInt(input[4]));
				platinumStall.setProjector(Integer.parseInt(input[5]));

				totalCost = platinumStall.getCost() + (platinumStall.getTvSet() * 100)
						+ (platinumStall.getProjector() * 500);

				System.out.println(platinumStall);
				break;
			}
			case 4:{
				System.exit(0);
			}
			}


			System.out.println("Total Cost:" + totalCost);
		}

		catch (Exception exception) {
			System.out.println("Exception is occured");
		}

	}
}
/*
Choose Stall Type
1.Silver Stall
2.Gold Stall
3.Platinum Stall
3
Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)
Vehicular,Engines are the best,Raizak,6000,5,3
Stall Name:Vehicular
Details:Engines are the best
Owner Name:Raizak
TV Sets:5
Projectors:3
Total Cost:8000
*/
