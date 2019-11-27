package com.test.jacoco.test;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

		import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	int b = hw.Method3(3, 4, -3);
    	int c = hw.Method3(5, 0, -3);
    	int d = hw.Method3(6, 1, 1);
    	int e = hw.Method3(4, -2, -3);
    	int f= hw.Method3(4, -2, 0);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
	@Test
	public void testMethod4() {
		HelloWorld hw = new HelloWorld();
		int a = hw.Method4(0, 0, 0, 0, 1);
		int b = hw.Method4(1, 1, 0, 0, 1);
		// int c = hw.Method4(1, 0, 0, 0, 1);
		int d = hw.Method4(5, 0, 0, 0, 0);
		int e = hw.Method4(5, 0, 1, 1, 0);
		int f = hw.Method4(5, 5, 1, 1, 0);
	}

	@Test
	public void testisTriangle() {
		HelloWorld hw = new HelloWorld();
		boolean a = hw.isTriangle(-1, -1, -1);
		assertFalse(a);
		boolean b = hw.isTriangle(1, 2, 3);
		assertFalse(b);
		boolean c = hw.isTriangle(1, 3, 2);
		assertFalse(c);
		boolean d = hw.isTriangle(3, 1, 2);
		assertFalse(d);
		boolean e = hw.isTriangle(3, 4, 5);
		assertTrue(e);
	}

	@Test
	public void testisBirthday() {
		HelloWorld hw = new HelloWorld();
		boolean a = hw.isBirthday(100, 1, 1);
		assertFalse(a);
		boolean b = hw.isBirthday(1998, 12, 28);
		assertTrue(b);
		boolean c = hw.isBirthday(2019, 12, 12);
		assertFalse(c);
	}

	@Test
	public void testminiCalculator() {
		HelloWorld hw = new HelloWorld();
		double a = hw.miniCalculator(1, 1, '+');
		double b = hw.miniCalculator(1, 1, '-');
		double c = hw.miniCalculator(1, 1, '*');
		double d = hw.miniCalculator(1, 1, '/');
		double e = hw.miniCalculator(1, 1, '0');
	}
}
