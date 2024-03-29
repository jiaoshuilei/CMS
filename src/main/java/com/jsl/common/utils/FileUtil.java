/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtil.java 
 * @Prject: jsl-common
 * @Package: com.jsl.common.utils 
 * @Description: TODO
 * @author: 焦大司令   
 * @date: 2019年8月8日 下午4:45:14 
 * @version: V1.0   
 */
package com.jsl.common.utils;

import java.io.File;

/** 
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author: 焦大司令
 * @date: 2019年8月8日 下午4:45:14  
 */
public class FileUtil {
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){

			return fileName.substring(fileName.lastIndexOf("."));
			
		}
		
	
		
	
	//TODO 实现代码
	
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
 	return new File(System.getProperty("java.io.tmpdir"));
	//TODO 实现代码
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
	
	 	return new File(System.getProperty("user.home"));
	//TODO 实现代码
	}


}
