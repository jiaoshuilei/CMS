/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: jsl-common
 * @Package: com.jsl.common.utils 
 * @Description: TODO
 * @author: 焦大司令   
 * @date: 2019年8月8日 下午3:16:15 
 * @version: V1.0   
 */
package com.jsl.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 焦大司令
 * @date: 2019年8月8日 下午3:16:15  
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.jsl.common.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
		
		
		Date date = DateUtil.getDateByInitMonth(new Date());

		SimpleDateFormat pm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(pm.format(date));
		
	}

	/**
	 * Test method for {@link com.jsl.common.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		Date date = DateUtil.getDateByFullMonth(new Date());

		SimpleDateFormat pm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(pm.format(date));

	}
	
	
	
/**
 * 拼接下面根据时间范围查询订单的SQL：
String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
 * @Title: test1 
 * @Description: TODO
 * @return: void
 */
	@Test
	public void test1() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		String sql2 = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));
		System.out.println(sql2);
		
		
	}

}
