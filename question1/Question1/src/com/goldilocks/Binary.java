package com.goldilocks;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
//		1

//		Write a function to convert a decimal number string into binary string.
//		For example, string A contains “123” which is decimal value 123. Convert
//		this string into binary string
		
	Scanner s=new Scanner(System.in);
	System.out.println("please type a number to convert it in binary");
	String binaryNum=s.next();
	
	int num=Integer.parseInt(binaryNum);
	String bag="";
	while(num>0) {
		bag=num%2+bag;
		num=num/2;
	}
	
	System.out.println("the given decimal number's "+"binary string is "+bag);
	}

}
