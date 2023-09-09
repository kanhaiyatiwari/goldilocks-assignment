package com.goldilocks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		Map<String,Integer>map=new HashMap<>();
		map.put("ram",23);
		map.put("shyam",32);
		map.put("rahul", 56);
		map.put("bhanu", 21);
		map.put("sheema", 19);
		map.put("rahul", 50);
		map.put("ram", 28);
		
		System.out.println("please enter name whose age you want to know");
		String name=s.next();
		System.out.println(name+" age is  "+map.get(name));
	}
}
