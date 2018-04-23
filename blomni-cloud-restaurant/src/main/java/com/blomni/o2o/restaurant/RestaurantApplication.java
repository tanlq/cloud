/**
 * @(#)Application.java, 十月 11, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.blomni.o2o.restaurant;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/**
 * 应用服务启动类，启动带配置选项 -dev -pre -prod 会根据配置选项读取不同环境的配置文件以cloud-osp开始，以参数结尾 eg. :
 * cloud-osp-dev 启动参数加上 --config.profile=dev (开发) 读取 cloud-osp-dev.properties
 * --config.profile=test(测试) 读取 cloud-osp-test.properties
 */
@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableScheduling
@EnableTransactionManagement
//@EnableConfigurationProperties({RedisConfig.class} )
public class RestaurantApplication {
	public static void main(String[] args) {

		SpringApplication.run(RestaurantApplication.class, args);

	}

	@Bean
	RestTemplate restTemplate() {
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
		messageConverters.add(new ResourceHttpMessageConverter());
		messageConverters.add(new SourceHttpMessageConverter<Source>());
		messageConverters.add(new AllEncompassingFormHttpMessageConverter());
		
		RestTemplate restTemplate =new RestTemplate(messageConverters);
		return restTemplate;
	}

}
