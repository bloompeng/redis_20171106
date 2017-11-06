package com.crm.redis001;

import redis.clients.jedis.Jedis;
import junit.framework.TestCase;

public class TestRedis extends TestCase {
	
	public void test01(){
		Jedis jedis=new Jedis();
		jedis.auth("123456");
		System.out.println("sh"+jedis.get("sh"));
	}

}
