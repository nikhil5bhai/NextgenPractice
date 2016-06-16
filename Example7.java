package com.nextgen.firstday;

import java.util.Scanner;

public class Example7 {
public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);		
		int side1;
		System.out.println("Enter the first side of geometry");
		side1 = in.nextInt();
		int side2;
		System.out.println("Enter the second side of geometry");
		side2 = in.nextInt();
		int side3;
		System.out.println("Enter the third side of geometry");
		side3 = in.nextInt();
		
		if (side1!=0&&side2!=0&&side3!=0 && side1<(side2+side3)&& side2<(side1+side3)&&side3<(side1+side2)){
			
			if (side1==side2 && side1==side3){
				System.out.println("This is an equilateral traingle");
			}
			else if (side1==side2 || side2==side3||side3==side1){
				System.out.println("This is an isosceles traingle");
			}
			else if (side1!=side2 && side2!=side3&&side3!=side1){
				System.out.println("This is a scalene traingle");
			}
			
		}
			
		
		else 
			System.out.println("This is not a traingle");
		
	}

}
