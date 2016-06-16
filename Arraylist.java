package com.nextgen.firstday;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String args[]){
	
	ArrayList<Integer> al = new ArrayList<Integer>();
						al.add(12);
						al.add(34);
						al.add(24);
						al.add(14);
						al.add(32);
						al.add(21);
						al.add(7);
						al.add(54);
						al.add(54);
						al.add(54);
						al.add(42);
						al.add(31);
						
						
	System.out.println("The size of arraylist is :" +al.size());
	
	for(int i=0; i<=(al.size()-1); i++){
	System.out.println(al.get(i));
	}
	
	int smallest = al.get(0);
	int largest = al.get(0);
	
	for(int i=0; i<=(al.size()-1); i++){
		if (al.get(i) > largest)
			largest = al.get(i);
		
		if (al.get(i) < smallest)
			smallest = al.get(i);
	}
	
	System.out.println("the largest & smallest no is " +largest+ " & " +smallest);
						
	}		
}
