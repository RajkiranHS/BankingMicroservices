package com.city.cityBank.beans;

public class AccountDetails {

	private String firstName;
	private String lastName;
	private String accountNumber;
	private EquityDetails equityDetails;
	private FdDetails fdDetails;
	
	
	
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AccountDetails(String firstName, String lastName, String accountNumber, EquityDetails equityDetails,
			FdDetails fdDetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.equityDetails = equityDetails;
		this.fdDetails = fdDetails;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public EquityDetails getEquityDetails() {
		return equityDetails;
	}
	public void setEquityDetails(EquityDetails equityDetails) {
		this.equityDetails = equityDetails;
	}
	public FdDetails getFdDetails() {
		return fdDetails;
	}
	public void setFdDetails(FdDetails fdDetails) {
		this.fdDetails = fdDetails;
	}
	
	
}
