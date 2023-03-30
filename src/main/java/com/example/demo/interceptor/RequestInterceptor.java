package com.example.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.demo.exception.InvalidRequestException;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) {
		if(StringUtils.isBlank(httpServletRequest.getParameter("id") )) {
			throw new InvalidRequestException("Invalid Request");
		}
		
		System.out.println("Intercepted in preHandle");
		
		return true;
		
	}
}
