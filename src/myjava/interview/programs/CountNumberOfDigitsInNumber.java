package myjava.interview.programs;

import java.util.Scanner;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {

		System.out.println("Enter number:");
		int Number=new Scanner(System.in).nextInt();
		int Count=0;
		while (Number!=0) {
			Number=Number / 10;
			Count++;
		}
		System.out.println("Number of Digits Count : "+Count);
	}

}
