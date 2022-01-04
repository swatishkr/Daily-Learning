package EverydayJava2022;

import java.util.Scanner;

public class UserDetail {

	String userLocation;
	int userAge;
	Scanner sc = new Scanner(System.in);
	String lastCommand ="";

	public void addUserLocation() {

		System.out.println("Please enter your Location");
			userLocation = sc.nextLine();
			lastCommand =userLocation;
		}

	public void addUserAge() {
	
		System.out.println("Please enter your Age");
			userAge = sc.nextInt();
	}

	public void addUserGender()

	{
		System.out.println("Please enter your Gender");
		String gender;
			gender = sc.nextLine();
			if (("male").equalsIgnoreCase(gender) || ("female").equalsIgnoreCase(gender)) {
				System.out.println("The entered user is a \n" + gender);

			} else {
				System.out.println("Please enter the correct gender");
			}
	}

	public void close() {
		sc.close();
		
	}
}
