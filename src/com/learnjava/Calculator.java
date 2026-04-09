package com.learnjava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number : ");
		int num1=sc.nextInt();
		
		System.out.println("enter second number : ");
		int num2=sc.nextInt();
		
		System.out.println("addition "+num1+num2);
	}
}