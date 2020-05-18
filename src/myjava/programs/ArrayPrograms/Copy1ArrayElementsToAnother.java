package myjava.programs.ArrayPrograms;

public class Copy1ArrayElementsToAnother {

	public static void main(String[] args) {
		int[] Arr1= {2,4,6,8,10,12,15};
		int[] Arr2= new int[Arr1.length];
		
		for (int i = 0; i < Arr1.length; i++) {
			Arr2[i]=Arr1[i];
		}
		System.out.println("Elements of Original Array");
		for (int i = 0; i < Arr1.length; i++) {
			System.out.println(""+i);
		}
		
		System.out.println("Elements of Copied Array");
		for (int i = 0; i < Arr2.length; i++) {
			System.out.println(""+i);
		}
		
	}
	
}
