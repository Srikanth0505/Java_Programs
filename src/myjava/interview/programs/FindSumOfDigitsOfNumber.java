package myjava.interview.programs;

import java.util.Scanner;

public class FindSumOfDigitsOfNumber {

	
	public static void main(String[] args) {
		System.out.println("Enter number:");
		int Number=new Scanner(System.in).nextInt();
		int sum=0;
		int Digit=0;
		while (Number>0) {
			Digit=Number % 10;
			sum=sum+Digit;
			Number=Number/10;
		}
	System.out.println("Sum : "+sum);
	}
}
