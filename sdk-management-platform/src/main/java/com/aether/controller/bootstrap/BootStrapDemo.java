package com.aether.controller.bootstrap;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bt")
public class BootStrapDemo {
		// 
		@RequestMapping(value = "/getJsonData")
		@ResponseBody
		public PageResult login(HttpServletRequest request,@RequestParam int limit, int offset, String departmentname, String statu) 
		{
			System.out.println("==================+departmentname>>"+departmentname);
			System.out.println("==================+statu>>"+statu);
			List<Department> lstRes = new ArrayList<>();
            for (int i = 1; i < 50; i++)
            {
            	Department oModel = new Department();
            	oModel.setShowdate("2016/10/"+i);
                oModel.setContry1("<div>国家" + i+"</div><div>126</div><div>126</div>");
                oModel.setContry2("<div>国家" + i+"</div><div>126</div><div>1264</div>");
                oModel.setContry3("<div>国家" + i+"</div><div>126</div><div>300</div>");
                oModel.setContry4("<div>国家" + i+"</div><div>126</div><div>200</div>");
                oModel.setContry5("<div>国家" + i+"</div><div>126</div><div>1216</div>");
                oModel.setContryo("<div>国家" + i+"</div><div>126</div><div>1126</div>");
                oModel.setContrya("<div>国家" + i+"</div><div>126</div><div>1269</div>");
                lstRes.add(oModel);
            }
            int total = lstRes.size();
            PageResult result = new PageResult(lstRes,total);
            return result;
		} 
}
