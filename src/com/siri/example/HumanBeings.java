package com.siri.example;

import java.util.Date;

public class HumanBeings{
	
	static int objectCount = 5;
	
	//Properties - Instance Variable
	private int height;
	private float weight;
	private String color;
	private Date dob;
	
	private String hairColor;
	
	/*Types of variable
	1. local Variable
	2. Instance Variable
	3. Static variable*/
	
	
	//Action - Methods
	
	HumanBeings(int heightPassed , float weightPassed , String colorPassed , Date dobPassed) {
		this.height = heightPassed;
		this.weight = weightPassed;
		this.color = colorPassed;
		this.dob = dobPassed;
	}
	
	public void walk() {
		String name = "Steve";
		System.out.println(name + " I am walking " );
	}
	
	public String tellMeHi() {
		return "Hi" + "this object count is " + objectCount;
	}
	
	public int addTwoNumbers(int x, int y) {
		return x + y;
	}
	
	public int getMeHeight() {
		return this.height;
	}
	

}
