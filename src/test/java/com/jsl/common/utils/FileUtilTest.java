/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: jsl-common
 * @Package: com.jsl.common.utils 
 * @Description: TODO
 * @author: 焦大司令   
 * @date: 2019年8月8日 下午7:51:37 
 * @version: V1.0   
 */
package com.jsl.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: 焦大司令
 * @date: 2019年8月8日 下午7:51:37  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.jsl.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
	String test = "hello.jsp";
	String name = FileUtil.getExtendName(test);
	System.out.println(name);
	}

	/**
	 * Test method for {@link com.jsl.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		System.out.println(FileUtil.getTempDirectory());
	}

	/**
	 * Test method for {@link com.jsl.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
