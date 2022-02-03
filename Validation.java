package com.validationOfId;

import java.util.Scanner;

public class Validation {

	//String arr[]=new String[6];
	
	public static void find(String search) {
		String[] arr= {"manyap@gmail.com", "moon@space.com","savethetigers@vergeofextn.com","health@welth.com","lifting@istheway.com",
		"sbd@powerlifitng.com"};
		boolean count=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(search))
			{
				count=true;
				break;
			}
		}if(count==true) {
			System.out.println("This mail ID is valid!");
		}
		else System.out.println("Invalid mail ID ");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your mail ID: ");
	String id= sc.next();
	Validation.find(id);
	
}
}
