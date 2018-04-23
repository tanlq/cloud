package com.blomni.o2o.restaurant.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blomni.o2o.restaurant.util.AbstractRestResponse;
import com.blomni.o2o.restaurant.util.DefaultRestApiResponse;
import com.blomni.o2o.restaurant.util.R;

@RestController
@RequestMapping("/hb")
public class HbController {
	
	@Value("${server.port}")
	private String serverPort;
	
	/**
	 * 心跳服务
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/ping")
	public ResponseEntity<?> test(HttpServletRequest request){
		ResponseEntity<?> result = null;
		AbstractRestResponse restResponse = new DefaultRestApiResponse();
		restResponse.setResCode(R.ReturnCodeEnum.code_success.getValue());
		try {
			InetAddress address = InetAddress.getLocalHost();
			restResponse.setMessage(address.getHostAddress()+":"+serverPort+" I am working!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}//获取的是本地的IP地址
		result = new ResponseEntity<AbstractRestResponse>(restResponse, HttpStatus.OK);
		return result;
	}
	
}
