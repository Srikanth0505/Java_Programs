package myjava.programs.ArrayPrograms;

public class LeftRotateArray {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};
		int n=3;
		int first;
		int j;
		System.out.print("before-->");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		for (int i = 0; i < n; i++) {
			first=arr[0];
			
			for (j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
		
			}
			arr[j]=first;
		}
		System.out.println();
		System.out.print("after--->");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	
	}
	
}
