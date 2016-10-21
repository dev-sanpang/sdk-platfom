package com.aether.dao;

import java.util.Map;

import com.aether.pojo.sys.SecRole;
import com.aether.pojo.sys.SecUser;

public interface IloginMapper  {
	
	 //  查询用户是否存在
	SecUser queryUserIsRight(Map<String, String> parm);
	
	// 根基用户ID 查询对应的角色信息
	SecRole queryRoleInfoByUserId(Map<String, String> parm);
}
