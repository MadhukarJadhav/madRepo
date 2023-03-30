package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.interceptor.RequestInterceptor;

@Configuration
public class SecurityConfig implements WebMvcConfigurer{

	
	//RequestInterceptor requestInterceptor = new RequestInterceptor();
	
	//@Autowired
	//public SecurityConfig(RequestInterceptor requestInterceptor) {
	//	this.requestInterceptor = requestInterceptor;
	//}
	@Autowired
	RequestInterceptor requestInterceptor;
	
	//@Autowired
	//public SecurityConfig(RequestInterceptor requestInterceptor) {
	//	this.requestInterceptor = requestInterceptor;
	//}
	
	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(requestInterceptor);
	}
}
