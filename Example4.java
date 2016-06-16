package com.nextgen.firstday;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);		
		int num;
		System.out.println("Enter the number");				
		num = in.nextInt();
		int power;
		System.out.println("Enter the power");				
		power = in.nextInt();
		
		int power1=power;
		
		int ans = 1;
		while(power1>1){
			ans = ans*num;
			power--;		
			System.out.println(+num+ " to the power "+power+ "is" +ans);
		}
		
		
	}
}
