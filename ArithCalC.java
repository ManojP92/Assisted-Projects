package com.ArithmaticCalculator;

import java.util.Scanner;

public class ArithCalC {
static void Add(double x, double y) {
	double z= x+y;
	int z1=0;
	if(z%1==0) {
		 z1=(int) z;
	System.out.println(" "+z1);}
	else
	System.out.println(" "+z);

}
static void sub(double x,double y) {
	double z=x-y;
	int z1=0;
	if(z%1==0) {
		 z1=(int) z;
	System.out.println(" "+z1);}
	else
	System.out.println(" "+z);

}
static void mul(double x, double y) {
	double z=x*y;
	int z1=0;
	if(z%1==0) {
		 z1=(int) z;
	System.out.println(" "+z1);}
	else
	System.out.println(" "+z);

}
static void div(double x,double y) {
	double z=x/y;
	int z1=0;
	if(z%1==0) {
		 z1=(int) z;
	System.out.println(" "+z1);}
	else
	System.out.println(" "+z);
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=1;
	while(a==1) {
	System.out.println("Enter two numbers: ");
	double num1= sc.nextDouble();
	double num2= sc.nextDouble();
	System.out.println("What operation do you want to perform?(Enter operator): ");
	char op=sc.next().charAt(0);
	switch(op) {
	case '+': ArithCalC.Add(num1, num2); break;
	case '-': ArithCalC.sub(num1, num2); break;
	case '*': ArithCalC.mul(num1, num2); break;
	case '/': ArithCalC.div(num1, num2); break;
	default: System.out.println("Invalid Input!"); break;

	}
	System.out.println("Enter 'Y' if you want to perform another calculation? else enter 'N' ");
	char another= sc.next().charAt(0);
	if(another=='N') {
		a=2;
	}
	System.out.println("Thanks for using my Arithmatic Calculator! ;) ");
	}
	
	
	
}
}
