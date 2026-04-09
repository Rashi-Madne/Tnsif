package com.learnjava;

import java.util.Scanner;

public class LoginSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select login type:");
		System.out.println("1. Admin");
		System.out.println("2. User");
		System.out.println("3. Guest");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Welcome Admin");
			break;

		case 2:
			System.out.println("Welcome User");
			break;

		case 3:
			System.out.println("Welcome Guest");
			break;

		default:
			System.out.println("Invalid login choice");
		}
	}
}