package myjava.interview.programs;

import java.util.Scanner;

public class GivenNumberIsPerfectSquareOrNot {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		int Number=new Scanner(System.in).nextInt();
		for (int i = 1; i < Number; i++) {
			if (i*i==Number) {
				System.out.println("Given Number is Square of "+i);
			}
		}
	}

}
