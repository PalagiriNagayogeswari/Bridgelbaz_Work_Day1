package com.bridgelabz_oops;

public class Bank_application {
	private int balance;
	public void setBalance(int amt) {
		balance=amt;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance=balance+money;
	}
	public void withdraw(int amt) {
		if(amt>balance) {
			System.out.println("No sufficient balance");
		}
		else
			balance=balance-amt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_application bk=new Bank_application();
		bk.setBalance(5000);
		System.out.println(bk.getBalance());
		bk.deposit(2000);
		bk.withdraw(1000);
		System.out.println(bk.getBalance());

	}

}
