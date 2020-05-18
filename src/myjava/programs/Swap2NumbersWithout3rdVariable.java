package myjava.programs;

import java.util.Scanner;

public class Swap2NumbersWithout3rdVariable {

	public static void main(String[] args) {
		int x, y;

		System.out.println("Enter Numbers...:X , Y");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		System.out.println("Before Swap  X:" + x);
		System.out.println("Before Swap  Y:" + y+"\n");
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("after Swap  X:" + x);
		System.out.println("after Swap  Y:" + y);
	}

}
