package com.city.cityBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.city.cityBank.beans.FdDetails;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FdDetailsService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getFallbackFdDetails")
	public FdDetails getFdDetailsDetails(){
		return restTemplate.getForObject("http://consumerBank/fdDetails", FdDetails.class);
	}
	
	public FdDetails getFallbackFdDetails(){
		return new FdDetails();
	}
}
