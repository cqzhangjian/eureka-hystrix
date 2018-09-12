package org.zj.eureka.order.server.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.zj.eureka.order.model.OrderModel;

@RestController
public class OrderController {

	@GetMapping(value="/order/{id}")
	public String getOrderById(@PathVariable String id,HttpServletRequest request) {
		
		OrderModel o = new OrderModel();
		o.setAddress("重庆渝中区");
		o.setId(id);
		o.setPhone(request.getRequestURL().toString());
		o.setPrice(888.00);
		
		return o.toString();
		
	}
}
