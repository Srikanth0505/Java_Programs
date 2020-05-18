package myjava.programs;

import java.util.Scanner;

public class HappyNumberOrNot {

	
	public static void main(String[] args) {
		System.out.println("Enter No...:");
		int num=new Scanner(System.in).nextInt();
		int result = num;
		
		if(result!=1 && result!=4) {
			result=HappyNumberOrNot(result);
		}
		
		
		if (result==1) {
			System.out.println("Given Number:"+result+"is Happy number");
		}else if (result==4) {
			System.out.println("Given Number:"+result+"is Not A Happy number\"");
		}
		
	}

	private static int HappyNumberOrNot(int result) {
		int rem=0,sum=0;
		
		while(result>0) {
			rem=result%10;
			sum=sum+(rem*rem);
			result=result/10;
		}
		
		return sum;
	}
	
}
