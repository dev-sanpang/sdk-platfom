package com.aether.service.impl.syslogin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aether.dao.IloginMapper;
import com.aether.entity.UserEntity;
import com.aether.pojo.sys.SecRole;
import com.aether.pojo.sys.SecUser;
import com.aether.service.syslogin.ILoginService;

@Service
public class LoginServiceImpl  implements ILoginService{
	@Autowired
	private IloginMapper loginMapper;
	//处理登录业务
	public String loginSysProcess(UserEntity user) {
		Map<String,String> parm = new HashMap<>();
		parm.put("username", user.getAccountName());
		parm.put("password", user.getPassword());
		SecUser loginuser = loginMapper.queryUserIsRight(parm);
		if(loginuser==null||loginuser.getUserId()==null||"".equals(loginuser.getUserId()))
			return null ;
		// 如果帐号密码正确 返回对应角色
		parm.clear();
		parm.put("userid", loginuser.getUserId()+"");
		SecRole role = loginMapper.queryRoleInfoByUserId(parm);
		return role.getRoleName();
	}

}
