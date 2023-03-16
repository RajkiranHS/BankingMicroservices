package com.city.cityBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.city.cityBank.beans.AccountDetails;
import com.city.cityBank.beans.EquityDetails;
import com.city.cityBank.beans.FdDetails;
import com.city.cityBank.feign.rest.client.ConsumerBankApi;
import com.city.cityBank.feign.rest.client.InvestmentBankApi;

@RestController
public class BalanceControllerFeign {
	
	@Autowired
	ConsumerBankApi consumerBankApi;
	
	@Autowired
	InvestmentBankApi investmentBankApi;

	@RequestMapping(value="/acBalanceFeign", method=RequestMethod.GET)
	public AccountDetails getTotalBalanceFeing(){
		EquityDetails equityDetails=investmentBankApi.getEquityInvestMentDtl();
		FdDetails fdDetails=consumerBankApi.getSavingBalanceDtl();
		return new AccountDetails( "Rajkiran", "Suryawanshi", "", equityDetails, fdDetails);
	}
}
