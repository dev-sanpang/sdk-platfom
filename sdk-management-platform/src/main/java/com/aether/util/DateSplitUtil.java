package com.aether.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateSplitUtil {
	public static List<Date> dateSplit(Date startDate, Date endDate)
	        throws Exception {
		 Long spi = endDate.getTime() - startDate.getTime();
		if(spi!=0){
		    if (!endDate.after(startDate)){
		    		throw new Exception("开始时间应该在结束时间之后");
		    }
		}
//	    Long spi = endDate.getTime() - startDate.getTime();
	    Long step = spi / (24 * 60 * 60 * 1000);// 相隔天数

	    List<Date> dateList = new ArrayList<Date>();
	    dateList.add(endDate);
	    for (int i = 1; i <= step; i++) {
	        dateList.add(new Date(dateList.get(i - 1).getTime()
	                - (24 * 60 * 60 * 1000)));// 比上一天减一
	    }
	    return dateList;
	}
	
	
	
	/** 
	*字符串的日期格式的计算 
	*/  
	    public static int daysBetween(String smdate,String bdate) throws ParseException{  
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(sdf.parse(smdate));    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(sdf.parse(bdate));    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));     
	    } 
}
