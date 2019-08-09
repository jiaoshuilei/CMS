/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: jsl-common
 * @Package: com.jsl.common.utils 
 * @Description: TODO
 * @author: 焦大司令   
 * @date: 2019年8月9日 上午9:30:06 
 * @version: V1.0   
 */
package com.jsl.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: 焦大司令
 * @date: 2019年8月9日 上午9:30:06  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.jsl.common.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testCloseAll() {
		
	}

	/**
	 * Test method for {@link com.jsl.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {

		String s = StreamUtil.readTextFile(new FileInputStream("c://Users//焦大司令//Desktop//test.txt"));
		System.out.println(s);
	}

	/**
	 * Test method for {@link com.jsl.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		String s = StreamUtil.readTextFile(new File("c://Users//焦大司令//Desktop//test.txt"));
		System.out.println(s);
		
	}

}
