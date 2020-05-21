package myjava.interview.programs.java8;

import java.util.Arrays;

public class FindLargestElementInArray {

	public static void main(String[] args) {

		int[] intArray = { 12, 33, 44, 73, 201, 100, 99, 88, 63 };
		int latgestElement = Arrays.stream(intArray).max().getAsInt();
		System.out.println("LatgestElement ::" + latgestElement);

	}

}
