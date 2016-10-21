package com.aether.controller.system;


import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aether.constant.LogingConstant;
import com.aether.entity.UserEntity;
import com.aether.service.syslogin.ILoginService;



@Controller
public class LoginPortController {
	private static Logger logger = Logger.getLogger(LoginPortController.class);
	
	@Autowired
	private ILoginService loginServiceImpl ;
	
	// 跳转到登录页面 
	@RequestMapping(value = "login", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String login(HttpServletRequest request) 
	{
		logger.error("================="+"进入登录页面1111");
		return "login";
	} 
	//处理登录业务
	@RequestMapping(value = "login", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String login(HttpServletRequest request, HttpServletResponse response, UserEntity user) {
		
		if(user!=null){
			logger.error("================="+"处理登录业务"+user.toString());
		}
		logger.error("================="+"处理登录业务");
		
		String role =loginServiceImpl.loginSysProcess(user);
		if(role==null){
			logger.error("================="+"进入登录c处理业务验证失败 ！");
			return "redirect:/login";
		}else{
			// 根据用户角色进入不同的 首页
			request.getSession().setAttribute(LogingConstant.LOGIN_CURRENT_LOGIN_USER, user);
			request.getSession().setAttribute(LogingConstant.LOGIN_CURRENT_LOGIN_ROLE, role);
			if(LogingConstant.LOGIN_ROLE_SDK.equals(role)){
				System.out.println("sdk");
				return "index_sdk";
			}else if(LogingConstant.LOGIN_ROLE_ADMIN.equals(role)){
				System.out.println("admin");
				return "index_admin";
			}else if(LogingConstant.LOGIN_ROLE_VIST.equals(role)){
				System.out.println("vist");
				return "index_vist";
			}
			return "500";
		}
		
	}
	
	
		// 跳转主页面首页
		@RequestMapping(value = "main/index", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
		public String main(HttpServletRequest request) 
		{
			logger.error("================="+"进入登录页面");
			return "main";
		}
		// 跳转到登录页面 
		@RequestMapping(value = "index", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
		public String index(HttpServletRequest request) 
		 {
				logger.error("================="+"进入登录页面");
				String role = (String) request.getSession().getAttribute(LogingConstant.LOGIN_CURRENT_LOGIN_ROLE);
				if(LogingConstant.LOGIN_ROLE_SDK.equals(role)){
					return "index_sdk";
				}else if(LogingConstant.LOGIN_ROLE_ADMIN.equals(role)){
					return "index_admin";
				}else if(LogingConstant.LOGIN_ROLE_VIST.equals(role)){
					return "index_vist";
				}
				return "index_vist1";
				
		} 
		/**
		 * 登出系统
		 * 
		 * @param request
		 * @param response
		 * @param model
		 * @param user
		 * @param result
		 * @return
		 */
		@RequestMapping("logout")
		public String logout(HttpServletRequest request) {
			// 清除session
	        Enumeration<String> em = request.getSession().getAttributeNames();
	        while (em.hasMoreElements()) {
	            request.getSession().removeAttribute(em.nextElement().toString());
	        }
	        request.getSession().removeAttribute(LogingConstant.LOGIN_CURRENT_LOGIN_USER);
	        request.getSession().invalidate();
	        String path = request.getContextPath();
	        // 拼接跳转页面路径
	        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	        System.out.println(request.getSession().getAttribute(LogingConstant.LOGIN_CURRENT_LOGIN_USER));
	        return "redirect:" + basePath;
			//return "redirect:/login.shtml";
		}

}
