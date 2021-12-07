package Inheritance_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Event {
	protected String name;
	protected String detail;
	protected String type;
	protected String ownerName;
	protected Double costPerDay;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public Event(String name, String detail, String type, String ownerName, Double costPerDay) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
	}
	public Event() {
		super();

	}

}

class Exhibition extends Event {

	private Integer noOfStall;
	public Exhibition(String name, String detail, String type, String ownerName, Double costPerDay,Integer noOfStall) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
		this.noOfStall=noOfStall;
	}

	public Exhibition() {
		super();
	}

	public Integer getNoOfStall() {
		return noOfStall;
	}
	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}


}
class StageEvent extends Event{
	private Integer noOfSeats;
	public StageEvent(String name, String detail, String type, String ownerName, Double costPerDay,Integer noOfSeats) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
		this.noOfSeats=noOfSeats;
	}

	public StageEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


}


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Exhibition eObj=new Exhibition();
		StageEvent sObj=new StageEvent();
		//String[] exhibition,stageevent;
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date,endda=null;
		long diffinMilles,difference;
		Double cost,gst;
		Date startdate=null;
		Date enddate=null;
		System.out.println("Enter your choice:");
		System.out.println("1.Exhibition event\r\n" + 
				"2.Stage event");
		int choice=sc.nextInt();

		System.out.println(choice==1?"Enter the details of exhibition:":"Enter the details of stage event:");

		String[] string = bi.readLine().split(",");
		eObj.setCostPerDay(Double.parseDouble(string[4]));

		System.out.println("Enter the starting date of the event:");
		date = sc.next();
		System.out.println("Enter the ending date of the event:");
		endda = sc.next();
		try {

			startdate = dateFormat.parse(date);
			enddate = dateFormat.parse(endda);   
		} catch (ParseException e) {
			System.out.println("Date format is not valid");
		}
		diffinMilles=(enddate.getTime())-(startdate.getTime());
		difference=TimeUnit.DAYS.convert(diffinMilles, TimeUnit.MILLISECONDS);
		cost=eObj.getCostPerDay()*difference;

		switch(choice) {
		case 1:
			eObj.setNoOfStall(Integer.parseInt(string[5]));
			gst=cost*(0.005*eObj.getNoOfStall());
			System.out.println("The GST to be paid is Rs."+gst);
			break;
		case 2:
			sObj.setNoOfSeats(Integer.parseInt(string[5])); 
			gst=cost*(0.15*sObj.getNoOfSeats());
			System.out.println("The GST to be paid is Rs."+gst);
			break;


		}

	}

}
/*
Enter your choice:
1.Exhibition event
2.Stage event
1
Enter the details of exhibition:
Science Fair,Exciting experiments,Fair,John,10000.00,10
Enter the starting date of the event:
03-01-2018
Enter the ending date of the event:
06-01-2018
The GST to be paid is Rs.1500.0
*/
