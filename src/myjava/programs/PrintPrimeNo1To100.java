package myjava.programs;

public class PrintPrimeNo1To100 {

	public static void main(String[] args) {
		System.out.println("Prime No 1 to 100 are..:  ");
		for (int i = 1; i <= 100; i++) {
			if(i%i==0 && i%2==1) {
				
				System.out.println(i);
			}
		}
		
	}
	
}
