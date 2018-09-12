package org.zj.eureka.order.server;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScServiceOrderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ScServiceOrderApplication.class, args);
		System.out.println("请输入实例端口:");
		Scanner scanner = new Scanner(System.in);
		String port  =scanner.nextLine();
		new SpringApplicationBuilder(ScServiceOrderApplication.class).properties("server.port:" + port).run(args);
		scanner.close();
	}
}
