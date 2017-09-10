package com.hrm.demo;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo002 
{
	public static void main(String[] args) {
		ArrayList<String> allText1 = new ArrayList<String>();
		allText1.add("b");
		allText1.add("a");
		allText1.add("b");
		
		HashSet<String> clone1 = new HashSet<>(allText1);
		System.out.println(allText1.size());
		System.out.println(clone1.size());
		
		HashSet<String> clone2 = new HashSet<String>();
		for(String s : allText1)
		{
			boolean v = clone2.add(s);
			System.out.println(v);
		}
		
	}
}
