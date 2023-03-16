package com.city.cityBank.feign.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.city.cityBank.beans.EquityDetails;


@FeignClient(name="investmentBank")
public interface InvestmentBankApi {

	@RequestMapping(value="/equityBalance",method=RequestMethod.GET)
	public EquityDetails getEquityInvestMentDtl();
}
