package com.crm.redis001;

import redis.clients.jedis.Jedis;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	
	public void testApp() {
		Jedis jedis=new Jedis("192.168.1.180", 6379);
		System.out.println("sh="+jedis.get("sh"));
	}
}
