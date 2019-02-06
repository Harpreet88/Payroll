package com.cg.payroll.beans;

public class BankDetails {
	@Override
	public String toString() {
		return "BankDetails [accountNumber=" + accountNumber + ", bankName=" + bankName + ", ifscCode=" + ifscCode
				+ "]";
	}
	private int accountNumber;
	
	private String bankName,ifscCode;
	
	public BankDetails() {
		accountNumber=0;
		bankName="";
		ifscCode="";
	}
	
	
	public BankDetails(int accountNumber, String bankName, String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
		
}
