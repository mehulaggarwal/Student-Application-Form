package com.gontuseries.studentadmissioncontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DaysOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = Calendar.getInstance();
		int dayofweek = cal.get(cal.DAY_OF_WEEK);
		if (dayofweek ==1) {// 1 means sunday,2 means monday and so on
			response.getWriter().write("the site is closed on sunday please try accessing it on any other day");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelandview) throws Exception {
		// this method will be called after spring MVC executes the request
		System.out.println("HandlerInterceptorAdapter: " + "Spring MVC called postHandle method for"
				+ request.getRequestURI().toString());

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// this method will be called after the response object is produced by
		// the view for the request
		System.out.println("HandlerInterceptorAdapter: " + "Spring MVC called afterCompletion method for"
				+ request.getRequestURI().toString());
	}
}
