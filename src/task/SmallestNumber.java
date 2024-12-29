package task;

import java.util.Scanner;

public class SmallestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firs = obj.nextInt();
		System.out.println("Enter second number:");
		int seco = obj.nextInt();
		System.out.println("Enter third number:");
		int third = obj.nextInt();
		
		if(firs < seco &&  firs < third) {
			System.out.println("The Smallest number is "+ firs);
		}
		else if(seco < firs &&  seco < third) {
			System.out.println("The Smallest number is "+ seco);
		}
		else if(third < firs &&  third < seco) {
			System.out.println("The Smallest number is "+ third);
		}
		else {
			System.out.println("Enter the correct value");
		}
		
	}
}
