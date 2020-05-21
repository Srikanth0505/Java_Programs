package myjava.interview.programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		String[] names= {"rukhmini","rajini","rajitha","ramya"};
		
		List<String> list=new ArrayList();
		list=Arrays.asList(names);
		list=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list);
	}
	
}
