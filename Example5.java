package com.nextgen.firstday;
import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int n;
		System.out.println("Enter the  number");				
		n = in.nextInt();
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       System.out.println("The factorial of " +n+ " is " + result);
	   }

}
