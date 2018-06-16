package com.siri.example;

import java.util.Date;

public class FederalBank {
	
	private int bankID;
	private String address;
	private int balance;
	
	
	
	public int getBankID() {
		return bankID;
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBalance() {
		return balance - 1000;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public FederalBank(int bankID, String address, int balance) {
		super();
		this.bankID = bankID;
		this.address = address;
		this.balance = balance;
	}
	
    public FederalBank() {
		
	}

	public String getTheBankAddress() {
		return this.address;
	}
	
	public int checkBalance() {
		return this.balance;
	}
	
	public int deposite(int amount) {
		return this.balance + amount;
	}
	
	public int withdraw(int withdrawalAmount) {

		System.out.println("IN Federal Banker Class");
		return  this.balance - withdrawalAmount;
	}
	

}
