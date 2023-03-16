package com.city.cityBank.feign.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.city.cityBank.beans.FdDetails;


@FeignClient(name="consumerBank")
public interface ConsumerBankApi{
	
	@RequestMapping(value="/fdDetails",method=RequestMethod.GET)
	public FdDetails getSavingBalanceDtl();

}
