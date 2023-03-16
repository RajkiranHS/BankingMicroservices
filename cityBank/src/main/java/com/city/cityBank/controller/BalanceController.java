package com.city.cityBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.city.cityBank.beans.AccountDetails;
import com.city.cityBank.beans.EquityDetails;
import com.city.cityBank.beans.FdDetails;
import com.city.cityBank.service.EquityDetailsService;
import com.city.cityBank.service.FdDetailsService;

@RestController
public class BalanceController {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	/*	By using Webclient framwork as REST client*/
	
	
	@RequestMapping(value="/acBalance", method=RequestMethod.GET)
	public AccountDetails getTotalBalanceInAc(){
		EquityDetails equityDetails=restTemplate.getForObject("http://INVESTMENTBANK/equityBalance", EquityDetails.class);
		FdDetails fdDetails=restTemplate.getForObject("http://consumerBank/fdDetails", FdDetails.class);
		return new AccountDetails( "Rajkiran", "Suryawanshi", "", equityDetails, fdDetails);
	}
	
	/*	handled by cercitbreak by using Hystrix as fall trolrens*/
	
	@Autowired 
	EquityDetailsService equityDetailsService;
	@Autowired
	FdDetailsService fdDetailsService;
	
	@RequestMapping(value="/acBalanceHystrix", method=RequestMethod.GET)
	public AccountDetails getTotalBalanceInAcHystrix(){
		EquityDetails equityDetails=equityDetailsService.getEquityDetails();
		FdDetails fdDetails=fdDetailsService.getFdDetailsDetails();
		return new AccountDetails( "Rajkiran", "Suryawanshi", "", equityDetails, fdDetails);
	}

}
