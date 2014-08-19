package com.ghome.smart.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期相关公共类
 * @author 
 * @version 1.0
 */
public final class DateUtil {
	
	/** 日期格式化字符串 */
    //private static SimpleDateFormat dateFormatter =
    //	               new SimpleDateFormat("yyyy/MM/dd");
	private static final String DATE_FORMAT = "yyyy/MM/dd";
    
    /**
     * 构造函数
     */
    private DateUtil() {
    }
    
    /**
     * 字符串变成日期类型<br>
     * @param date 日期字符串
     * @return 变换后日期型<br>
     */
    public static Date getDate(String date) {
    	SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT);
        Date ret = null;
        if (StringUtil.isNull(date)) {
            return ret;
        }
        try {
            //ret = DateUtil.dateFormatter.parse(date);
        	ret = dateFormatter.parse(date);
        } catch (ParseException e) {
        	ret = null;
        }
        return ret;
    }
    
    /**
     * 日期型变成字符串类型
     * @param date 日期型参数
     * @return 字符串<br>
     */
    public static String getStringDate(Date date) {
    	SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT);
        if (date != null) {
            //return DateUtil.dateFormatter.format(date);
        	return dateFormatter.format(date);
        }
        return "";
    }
    
    public static String getStringDate(Date date,String format) {
    	SimpleDateFormat dateFormatter=null;
    	if(StringUtil.isEmpty(format)){
    		dateFormatter= new SimpleDateFormat(DATE_FORMAT);
    	}else{
    		dateFormatter= new SimpleDateFormat(format);
    	}
        if (date != null) {
            //return DateUtil.dateFormatter.format(date);
        	return dateFormatter.format(date);
        }
        return "";
    }
    
    /**
     * 根据格式化规则回去当前时间
     * @param format
     * @return
     */
    public static String getStringDate(String format) {
    	SimpleDateFormat dateFormatter=null;
    	if(StringUtil.isEmpty(format)){
    		dateFormatter= new SimpleDateFormat(DATE_FORMAT);
    	}else{
    		dateFormatter= new SimpleDateFormat(format);
    	}
        return dateFormatter.format(new Date());
    }
    
   /**
    * 日期加上系统时间中的时分秒 
    * @param date
    * @return
    */
    public static Date dateAddTime(Date date){
    	
    	Calendar c = Calendar.getInstance();  
		Calendar c2 = Calendar.getInstance();
    	c2.setTime(date);
    	c.set(Calendar.YEAR, c2.get(Calendar.YEAR));
    	c.set(Calendar.DAY_OF_YEAR, c2.get(Calendar.DAY_OF_YEAR));
    	return c.getTime();
    	
    }
}
