package com.city.cityBank.beans;

public class EquityDetails {
	
	private String acNumber;
	private Double investMentPrice;
	private Double totalLoss;
	
	public EquityDetails() {
	}

	
	public EquityDetails(String acNumber, Double investMentPrice, Double totalLoss) {
		super();
		this.acNumber = acNumber;
		this.investMentPrice = investMentPrice;
		this.totalLoss = totalLoss;
	}

	public String getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}

	public Double getInvestMentPrice() {
		return investMentPrice;
	}

	public void setInvestMentPrice(Double investMentPrice) {
		this.investMentPrice = investMentPrice;
	}

	public Double getTotalLoss() {
		return totalLoss;
	}

	public void setTotalLoss(Double totalLoss) {
		this.totalLoss = totalLoss;
	}
	
	
	
	

}
