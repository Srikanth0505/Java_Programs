package myjava.programs;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		int x,y,t;
		
		System.out.println("Enter Numbers...:X , Y");
		x=new Scanner(System.in).nextInt();
		y=new Scanner(System.in).nextInt();
		System.out.println("Before Swap  X:"+x);
		System.out.println("Before Swap  Y:"+y);
		t=x;
		x=y;
		y=t;
		System.out.println("after Swap  X:"+x);
		System.out.println("after Swap  Y:"+y);
	
	}
	
}
