package com.akash.maharana.springBoot.microServices.currencyconversionservicewithribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.akash.maharana.springBoot.microServices.currencyconversionservicewithribbon")
@EnableDiscoveryClient
public class CurrencyConversionServiceWithRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceWithRibbonApplication.class, args);
	}
}
