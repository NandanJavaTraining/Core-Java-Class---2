package com.siri.example;

public class BankTester {
	
	public static void main(String[] args) {
		
		
		FederalBank fBank = new FederalBank(1, "3 Ethel Drive , Edison , NJ 08854", 10000);
		
		System.out.println(fBank.checkBalance());
		
		int neweBalance = fBank.deposite(10000);
		fBank.setBalance(neweBalance);
		System.out.println(fBank.checkBalance());
		
		neweBalance = fBank.withdraw(1000);
		fBank.setBalance(neweBalance);
		System.out.println(fBank.checkBalance());
		System.out.println("Getter" + fBank.getBalance());
		
		BOABank boaBank = new BOABank(5000,111,9999 , "Addr");

		//boaBank
		//boaBalance = 5000 , bankID  = 0, address = null, balance = 0

		System.out.println("BOA Balance: " + boaBank.checkBalance());

		System.out.println("Remanaing Balance: " + boaBank.withdraw(1000));
		
		
	}

}
