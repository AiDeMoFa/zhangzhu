package com.ysd.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ysd.redis.RedisTrans;

public class LoginInterceptor implements HandlerInterceptor{

	@Resource
	private RedisTrans redisTrans;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url=request.getServletPath();
		String uid=redisTrans.get("uid");
		System.out.println(uid);
		if(uid!=null && !uid.equals("")) {
			return true;
		}else {
			redisTrans.set("message", "ÓÃ»§ÃØÔ¿Îª¿Õ");			
		}
		if (url.indexOf("/api/login") >= 0) {
			return true;
		}
		
		
	
		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
