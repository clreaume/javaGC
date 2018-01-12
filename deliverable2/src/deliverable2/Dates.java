package deliverable2;

import java.util.Scanner;
public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Think of two dates. Enter date 1's year (yyyy): ");
		int date1Year = input.nextInt();
		System.out.println("Enter date 1's month (0-12): ");
		int date1Month = input.nextInt();
		System.out.println("Enter date 1's day (1-31): ");
		int date1Day = input.nextInt();
		
		System.out.println("Enter date 2's year (yyyy): ");
		int date2Year = input.nextInt();
		System.out.println("Enter date 2's month (0-12): ");
		int date2Month = input.nextInt();
		System.out.println("Enter date 2's day (1-31): ");
		int date2Day = input.nextInt();
		
		int yearsApart = Math.abs(date1Year - date2Year);
		int monthsApart = Math.abs(date1Month - date2Month);
		int daysApart = Math.abs(date1Day - date2Day);
		
		
		System.out.println("Your dates are " + yearsApart + " year(s) " + monthsApart + " month(s), and " + daysApart + " day(s) apart.");
		
	}

}
