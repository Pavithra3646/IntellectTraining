package Day4_case_Study;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int itemTypeCount = 0;
		ItemType[] itemTypeArray = null;
		ItemType itemType = null;
		ItemTypeBO itemTypeBO = new ItemTypeBO();
		String search = null;

		try {


			System.out.println("Enter the Number of Item Type");
			itemTypeCount = Integer.parseInt(bufferedReader.readLine());

			itemTypeArray = new ItemType[itemTypeCount];

			for (int i = 0; i < itemTypeCount; i++) {
				itemType = new ItemType();

				System.out.printf("Enter the Item Type %d Name\n", i + 1);
				itemType.setName(bufferedReader.readLine());

				System.out.println("Enter the Deposit Amount");
				itemType.setDeposit(Double.parseDouble(bufferedReader.readLine()));

				System.out.println("Enter the Cost per day");
				itemType.setCostPerDay(Double.parseDouble(bufferedReader.readLine()));

				itemTypeBO.add(itemType, itemTypeArray, i);
			}

			itemTypeBO.display(itemTypeArray);

			System.out.println("Enter the Name of the item to be searched");
			search = bufferedReader.readLine();

			itemTypeBO.search(search, itemTypeArray);

		} catch (InputMismatchException exception) {
			System.out.println("Input is not valid");

		} catch (Exception exception) {
			System.out.println("Exception is occured");
		}

	}


}

/*
Enter the Number of Item Type
2
Enter the Item Type 1 Name
Electricals
Enter the Deposit Amount
2000
Enter the Cost per day
200
New item added successfully
Enter the Item Type 2 Name
Mechanic kit
Enter the Deposit Amount
3000
Enter the Cost per day
250
New item added successfully
Item Type Number 1:
Name:Electricals
Deposit Amount:2000.0
Cost Per Day:200.0
Item Type Number 2:
Name:Mechanic kit
Deposit Amount:3000.0
Cost Per Day:250.0
Enter the Name of the item to be searched
Electronics
Searched Item Type not found
*/
