package deliverable1;

import java.util.Scanner;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		String numAsString;
		int temp1 = 0;
		int temp2 = 0;
		int i;
		
		System.out.println("Enter a number: ");
		num1 = input.nextInt();
		System.out.println("Enter another number: ");
		num2 = input.nextInt();
		
		numAsString = Integer.toString(num1);
		int numDigis = numAsString.length();
		
		for (i=0 ; i < numDigis ; ++i) {
			if (temp1 == temp2) {
				temp1 = num1 % 10 + num2 % 10;
				num1 = num1 / 10;
				num2 = num2 / 10;
				temp2 = num1 % 10 + num2 %10;
			}
			else {
				System.out.println("False");
				break;
			}
			
		}
		if (i==numDigis) {
			System.out.println("True");
		}
	
	}

}