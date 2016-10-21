package com.aether.filte;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import com.aether.constant.LogingConstant;
import com.aether.entity.UserEntity;

public class LoginAccessFilter implements Filter  {
	
	private static  Logger logger = Logger.getLogger(LoginAccessFilter.class);
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unused")
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
				// 获得在下面代码中要用的request,response,session对象
		        HttpServletRequest servletRequest = (HttpServletRequest) request;
		        HttpServletResponse servletResponse = (HttpServletResponse) response;
		        HttpSession session = servletRequest.getSession();
		        
		     // 获得用户请求的URI
		     String path = servletRequest.getRequestURI();
		     // 请求路径
		     logger.info("--请求--"+path);
		     UserEntity currentUser = (UserEntity) session.getAttribute(LogingConstant.LOGIN_CURRENT_LOGIN_USER);
		     if(currentUser!=null&&"/sdk-management-platform/login".indexOf(path)>-1){
		    	 servletResponse.sendRedirect("/sdk-management-platform/index");
		    	 return;
		     }
		     if(checkIsStaicResource(path)){
		    	 logger.info("静态资源     不进行拦截 >>>>"+path);
                 chain.doFilter(servletRequest, servletResponse);
                 return;
		     }
	         /*创建类LogingConstant.java，里面写的是无需过滤的页面*/
	         for (int i = 0; i < LogingConstant.NO_Filter_Path.length; i++) {
	             if (LogingConstant.NO_Filter_Path[i].indexOf(path) > -1) {
	            	 logger.info("开放路径  >>>>"+path);
	                 chain.doFilter(servletRequest, servletResponse);
	                 return;
	            }
	         }
	         
		 // 既没有用户登录信息  又不是非过滤Mapper 路径 
		     if(currentUser==null){
		    	// 跳转到登陆页面
		    	servletResponse.sendRedirect("/sdk-management-platform/login");
		     }else{
		    	 logger.info(currentUser.getAccountName()+"--用户已经登录--");
		    	 chain.doFilter(servletRequest, servletResponse);
		     }
		        
	}
	// 设置不拦截的资源文件 URI 不包含url 后面的参数的
	private boolean checkIsStaicResource(String path) {
		
		return path.endsWith(".css")||path.endsWith(".js")||path.endsWith(".jpg")||path.endsWith(".png")||path.endsWith(".ico");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
