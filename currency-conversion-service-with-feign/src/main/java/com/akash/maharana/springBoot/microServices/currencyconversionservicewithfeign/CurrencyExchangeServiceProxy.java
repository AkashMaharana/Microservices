package com.akash.maharana.springBoot.microServices.currencyconversionservicewithfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service",url="localhost:2644")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);

}
