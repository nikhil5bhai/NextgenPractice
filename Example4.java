package com.nextgen.firstday;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);		
		
		System.out.println("Enter the number");				
		int num = in.nextInt();
		
		System.out.println("Enter the power");				
		int power = in.nextInt();
		
		System.out.println(+num+" to the power " +power+ "is " +(int)Math.pow(num, power));
					
		}
		
	}
