package com.siri.example;

import java.util.Date;

public class HumanBeingTester {
	
	
	
	public static void main(String[] args) {
		
		//Construcntor
		HumanBeings steveJobs = new HumanBeings(180,170,"white",new Date());
		steveJobs.walk();
		int result = steveJobs.addTwoNumbers(1, 3);
		System.out.println(result);
		System.out.println(steveJobs.getMeHeight());
	
		
		
	}

}


/*OOPS 

1. Inheritance
2. Polymorphism - many ways ,  overriding and overloading 
3. Abstraction - 2 , abstract class and interface
4. Encapsualtion

*/
