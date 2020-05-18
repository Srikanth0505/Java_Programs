package myjava.interview.programs;

import java.util.Scanner;

public abstract class CountEvenOddNumbersInGivenNumber {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		int Number = new Scanner(System.in).nextInt();
		int evenCount = 0;
		int oddCount = 0;
		while (Number != 0) {
			int remain=Number%10;
			if (Number % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			Number=Number/10;
		}
		System.out.println("Even Numbers"+evenCount);
		System.out.println("Odd  Numbers"+oddCount);
	}
}
