package com.gzb.callcenter.service.utils;

import com.gzb.callcenter.service.utils.KidUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* KidUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®¶þÔÂ 31, 2018</pre> 
* @version 1.0 
*/ 
public class KidUtilTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isKid(int age) 
* 
*/ 
@Test
public void testIsKid() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getGender(int name) 
* 
*/ 
@Test
public void testGetGender() throws Exception { 
//TODO: Test goes here...

    String name1 = "mimy";
    String name2 = "man";
    String name3 = "yaoyao";
    String name4 = "momo";

    KidUtil util = new KidUtil();

    Assert.assertEquals(1,util.getGender(name1));
    Assert.assertEquals(2,util.getGender(name2));
    Assert.assertEquals(3,util.getGender(name3));
    Assert.assertEquals(4,util.getGender(name4));
} 


} 
