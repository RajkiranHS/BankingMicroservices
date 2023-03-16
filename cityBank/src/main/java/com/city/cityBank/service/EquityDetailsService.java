package com.city.cityBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.city.cityBank.beans.EquityDetails;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class EquityDetailsService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getFallbackEquityDetails")
	public EquityDetails getEquityDetails(){
		return restTemplate.getForObject("http://INVESTMENTBANK/equityBalance", EquityDetails.class);
	}
	
	public EquityDetails getFallbackEquityDetails(){
		return new EquityDetails();
	}

}
