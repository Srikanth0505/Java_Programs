package myjava.interview.programs;

import java.util.Scanner;

public class FindFirstLastNumberInGivenNumber {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		System.out.println("Enter number:");
		int Number=new Scanner(System.in).nextInt();
		int lastDigit=Number % 10;
		int firstDigit=Number;
		while (firstDigit>=10) {
			firstDigit=firstDigit/10;
		}
		System.out.println("First Digit ::"+firstDigit);
		System.out.println("Last Digit ::"+lastDigit);
		System.out.println("Sum ::"+(firstDigit+lastDigit));
		
	}
	
}
