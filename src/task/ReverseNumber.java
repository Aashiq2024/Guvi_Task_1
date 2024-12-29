package task;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = obj.nextInt();

		int answer=0;
		while(num>0) {
			int lastDig = num % 10;
			answer =answer*10+ lastDig;
			num =num/10;
		}
		
		System.out.println("The Reversed Number is "+ answer);
	}

}
