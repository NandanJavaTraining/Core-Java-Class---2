package com.siri.example;

import java.util.Date;

public class BOABank extends FederalBank implements WorldBankInterface {
	
	
	int boaBalance;
	
	public BOABank(int boaBalance, int fbID , int fbBalance , String fbAddr) {
		super(fbID,fbAddr,fbBalance);
		this.boaBalance = boaBalance;
	}

	//Overriding
	public int withdraw(int withdrawalAmount) {
		System.out.println("IN BOA Class");
		if(this.boaBalance < 1000) {
			return 0;
		} else {
			return  this.boaBalance - withdrawalAmount;
		}
	}
	
	//Over laoding
	public int withdraw(int withdrawalAmount, String password) {
		if(password == "passer") {
			return  this.boaBalance - withdrawalAmount;
		} else {
			return 0;
		}
	}
	
	public String checkIfIQualifyForCC() {
		return this.boaBalance > 3000 ? "true" : "false";
	}

	
	public Date getDOB() {
		// TODO Auto-generated method stub
		return new Date();
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "INDIA";
	}

	@Override
	public String getPassportNumber() {
		// TODO Auto-generated method stub
		return "1213x45";
	}
	
	/*Visiblity - methods, instance variables , static variables , constructors
	1. public
	2. protected
	3. default
	4. private*/
	
	
	

	
}
