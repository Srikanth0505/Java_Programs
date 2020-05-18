package myjava.programs.ArrayPrograms;

public class PrintEvenOddPositionElements {

	public static void main(String[] args) {
		
		 int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7};   
		 
		 System.out.print("Elements of given array present on Even position: ");  
		 for (int i = 1; i < arr.length; i=i+2) {
			
			 System.out.print(arr[i]+" ");
		}
		 System.out.println();
		 System.out.print("Elements of given array present on Odd position: ");  
		 for (int i = 0; i < arr.length; i=i+2) {
			
			 System.out.print(arr[i]+" ");
		}
	}
	
	
}
