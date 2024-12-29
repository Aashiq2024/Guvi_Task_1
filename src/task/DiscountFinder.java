package task;

import java.util.Scanner;

public class DiscountFinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the amount you purchased: ");
		int amt = obj.nextInt();
		
		int disc=0;
		int ttlamt=0;
		if(amt>0) {
			if(amt>0 && amt <=500) {
				ttlamt = amt;
				System.out.println("Total Amount ₹"+ttlamt);
			}
			else if(amt>500 && amt <=1000) {
				disc = amt * 10 / 100; 
                ttlamt = amt - disc; 
                System.out.println("Discount ₹" + disc);
                System.out.println("Total Amount ₹" + ttlamt);
            } else {
                disc = amt * 20 / 100; 
                ttlamt = amt - disc;
                System.out.println("Discount ₹" + disc);
                System.out.println("Total Amount ₹" + ttlamt);
			}
		}
		else {
			System.out.println("Uh-oh! Negative numbers aren't accepted. Try entering a positive amount.");
		}
	}	
}
