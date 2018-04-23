/**
 * eureka server
 * @author 52395090@qq.com
 * http://git.oschina.net/zhou666/spring-cloud-7simple
 */
package com.blomni.o2o.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}
}
