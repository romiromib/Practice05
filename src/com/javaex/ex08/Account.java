package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
	
    
    //생성자 작성
    public Account() {
    	
    }
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    
    //필요한 메소드 작성
    //-gs
    public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
    //-일반
	
	
	public int deposit(int money){
		return this.balance = balance + money;
		 
	}
	public int withdraw(int money) {
		return this.balance = balance - money;
		
	}
	public void showBalance() {
		System.out.println(balance);
	}
	
	
}
