package myjava.interview.programs.java8;

import java.util.Arrays;
import java.util.function.Consumer;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] i = {1,3,4,5,2,6,2,3,4,6,7,8,9};
		
		Arrays.stream(i).distinct().forEach(element->System.out.print(element+" "));
		
		System.out.println("------------------");
		
		String [] str= {"krishna","kamal","krishna","kamal","raj","obul","ananth","abcd","xyz"};
		
		Arrays.stream(str).distinct().forEach(element->System.out.print(element+" "));
		
	}
	
}
