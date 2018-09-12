package org.zj.eureka.invoke.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class InvokeOrderServerController {

	@Autowired
	RestTemplate testTemplate;
	
	
	@GetMapping(value="/api/invoke/order/{id}")
	@HystrixCommand(fallbackMethod="fallbackInfo")
	public String getOrderInfo(@PathVariable String id) {
		return testTemplate.getForObject("http://sc-service-order/order/"+id, String.class);
	}
	
	
	public String fallbackInfo(@PathVariable String id) {
		
		return "服务不可以用,稍后再试..";
	}
	
	
}
