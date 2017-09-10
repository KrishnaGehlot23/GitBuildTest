package com.hrm.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo001 
{
	public static void main(String[] args) 
	{
		ArrayList<String> allText1 = new ArrayList<String>();
		allText1.add("b");
		allText1.add("a");
		allText1.add("c");
		
		ArrayList<String> clone1 = new ArrayList<String>(allText1);
		Collections.sort(clone1);
		System.out.println(clone1.equals(allText1));
		
		ArrayList<String> allText2 = new ArrayList<String>();
		allText2.add("a");
		allText2.add("b");
		allText2.add("c");
		
		ArrayList<String> clone2 = new ArrayList<String>(allText2);
		Collections.sort(clone2);
		System.out.println(clone2.equals(allText2));

//		git commit branch two
		
		ArrayList<String> clone3 = new ArrayList<String>(allText2);
		Collections.sort(clone3);
		System.out.println(clone2.equals(allText2))
		
	}
}
