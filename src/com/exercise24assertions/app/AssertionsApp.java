package com.exercise24assertions.app;
import java.util.Scanner;
public class AssertionsApp {

	public static void main(String[] args) {
		int age = 0;
		char answer = 'y';
		Scanner scan = new Scanner(System.in);
		while(answer=='y') {
			System.out.print("Input you're age: ");
			age = scan.nextInt();
			System.out.println(isMajor(age));
			System.out.print("Do you want to input a different age? ");
			answer = scan.next().charAt(0);
		}
		System.out.println("Bye");
	}
	
	public static String isMajor(int age) {
		String response = "";
		assert age>0: "Only positive age accepted";
		if(age<18)
			response =  "You're a child";
		if(age>=18)
			response =  "Chavorruco";
		return response;
	}

}
