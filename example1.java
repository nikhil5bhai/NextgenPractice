package com.nextgen.firstday;
import java.util.Scanner;

public class example1 {
	public static void main(String[] aggs){
		
		Scanner in = new Scanner(System.in);		
		int a;
		System.out.println("Enter the first number");				
		a = in.nextInt();
		int b;
		System.out.println("Enter the first number");
		b = in.nextInt();
		 
		int addition = a+b;
		
		System.out.println("The addition of " +a+ " and " +b+ " is " +addition);
	}

}
