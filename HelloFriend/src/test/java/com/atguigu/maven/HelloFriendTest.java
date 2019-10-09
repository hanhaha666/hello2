package com.atguigu.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloFriendTest {

	@Test
	public void testHelloFriend(){
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("BBB");
		assertEquals("Hello BBB I am John",results);
		System.out.println("你好" + results);
	}
}
