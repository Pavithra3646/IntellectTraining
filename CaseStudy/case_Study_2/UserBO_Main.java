package Day4_case_Study;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class User implements Comparable<User> {
	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public User() {
	}

	public User(String name, String mobileNumber, String username, String password) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public int compareTo(User user) {
		return this.name.compareTo(user.name);
	}

	@Override
	public String toString() {
		return "Name:"+name+"\nMobile Number:"+mobileNumber;
	}
}




class UserBO {
	public void addUser(User[] userArray, User userIns) {
		int last_index = 0;

		for (int i = 0; i < userArray.length; i++) {
			if (userArray[i] == null) {
				last_index = i;
				break;
			}
		}

		userArray[last_index] = userIns;
	}

	public void sortUsers(User[] userArray) {
		Arrays.sort(userArray);
	}

	public Boolean deleteUser(User[] userArray, String name) {
		for (int i = 0; i < userArray.length; i++) {
			if (userArray[i].getName().equals(name)) {
				userArray[i] = null;
				return true;
			}
		}

		return false;
	}

	public void displayAll(User[] userArray) {
		System.out.println("User Details:");

		for (int i = 0; i < userArray.length; i++) {
			if (userArray[i] != null) {
				System.out.printf("User %d\n", i + 1);
				System.out.println(userArray[i]);
			}
		}
	}
}


public class Main1 {
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		int usersCount = 0;
		User[] usersArray = null;
		User user = null;
		UserBO userBO = null;
		String userToBeDeleted = null;
		boolean isUserDeleted = false;

		try {
			userBO = new UserBO();

			System.out.println("Enter the number of users");
			usersCount = Integer.parseInt(bufferedReader.readLine());

			usersArray = new User[usersCount];

			for (int i = 0; i < usersCount; i++) {
				user = new User();

				System.out.printf("Enter the details of User %d\n", i + 1);
				System.out.println("Enter the name of the user:");
				user.setName(bufferedReader.readLine());

				System.out.println("Enter the mobile number of the user:");
				user.setMobileNumber(bufferedReader.readLine());

				System.out.println("Enter the username of the user:");
				user.setUsername(bufferedReader.readLine());

				System.out.println("Enter the password of the user:");
				user.setPassword(bufferedReader.readLine());

				userBO.addUser(usersArray, user);
			}

			System.out.println("User details as entered:");
			userBO.displayAll(usersArray);

			userBO.sortUsers(usersArray);

			System.out.println("After sorting:");
			userBO.displayAll(usersArray);

			System.out.println("Enter the user to be deleted:");
			userToBeDeleted = bufferedReader.readLine();

			isUserDeleted = userBO.deleteUser(usersArray, userToBeDeleted);

			if (isUserDeleted) {
				System.out.println("User deleted successfully");
				System.out.println("After Deleting:");
				userBO.displayAll(usersArray);
			} else {
				System.out.println("No user found with given name");
			}

		} catch (InputMismatchException exception) {
			System.err.println("Input is not valid!!!");
		}catch(Exception ex) {
			System.out.println("Exception is occured");
		}
	}
}


/*
Enter the number of users:
2
Enter the details of User 1
Enter the name of the user:
John
Enter the mobile number of the user:
12345
Enter the username of the user:
john
Enter the password of the user:
john
Enter the details of User 2
Enter the name of the user:
Joe
Enter the mobile number of the user:
67890
Enter the username of the user:
joe
Enter the password of the user:
joe
User details as entered:
User Details:
User 1
Name:John
Mobile Number:12345
User 2
Name:Joe
Mobile Number:67890
After sorting:
User Details:
User 1
Name:Joe
Mobile Number:67890
User 2
Name:John
Mobile Number:12345
Enter the user to be deleted:
John
User deleted successfully 
After Deleting:
User Details:
User 1
Name:Joe
Mobile Number:67890
*/
