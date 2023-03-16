package com.city.cityBank.beans;

public class FdDetails {
	
	private String accountNo;
	private Double investedFd;
	
	public FdDetails() {
	}
	
	public FdDetails(String accountNo, Double investedFd) {
		super();
		this.accountNo = accountNo;
		this.investedFd = investedFd;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Double getInvestedFd() {
		return investedFd;
	}

	public void setInvestedFd(Double investedFd) {
		this.investedFd = investedFd;
	}
	

	
}
