package myjava.programs;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int sum=0;
		System.out.println("Enetr Number..:");
		String inpu=new Scanner(System.in).nextLine();
		char[] ch=inpu.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			sum=sum+((int)ch[i]);
			sum =sum-48;
		}
		System.out.println("Sum of Digits:"+sum);
	}

}
