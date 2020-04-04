package com.pjtreact.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class Interceptor implements HandlerInterceptor {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		System.out.println("### preHandle ###");
		/*
		 * 4. 시스템은 사용자가 요청한 기능을 수행하기 전에 요청한 사용자의 세션을 체크한다.
 		 * 5. 시스템은 올바른 세션일 경우 기능 승인, 세션이 없거나 올바르지 않을 경우 사용자를 로그인 페이지로 이동시킨다.
 		 * 
			HttpSession session = request.getSession();
	        UserVO loginVO = (UserVO) session.getAttribute("loginUser");
	 
	        if(ObjectUtils.isEmpty(loginVO)){
	            response.sendRedirect("/moveLogin.go");
	            return false;
	        }else{
	            session.setMaxInactiveInterval(30*60);
	            return true;
	        }
	        
	     *
        */
		return true;
	}
	
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    	System.out.println("### postHandle ###");
    }
 
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	System.out.println("### afterCompletion ###");
    }
	
}
