package com.akash.maharana.springBoot.microServices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.maharana.springBoot.microServices.limitsservice.bean.LimitConfiguration;
import com.akash.maharana.springBoot.microServices.limitsservice.config.Configuration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	//Hard coded max and min value
	/*@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration(){
		return new LimitConfiguration(1000,1);
	}*/
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration(){
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
