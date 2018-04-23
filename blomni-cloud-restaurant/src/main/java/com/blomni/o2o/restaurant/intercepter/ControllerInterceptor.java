package com.blomni.o2o.restaurant.intercepter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerInterceptor {	
	private static final Logger logger = LoggerFactory.getLogger(ControllerInterceptor.class);
	
	@Pointcut("execution(* com.blomni.o2o..*(..)) and @annotation(org.springframework.web.bind.annotation.RestController)")  
    public void controllerMethodPointcut(){
		logger.debug("Rest method invoked");
	}  

}
