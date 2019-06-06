package demo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {
	
	testStringDemo1 demo;

	@Before
	public void setUp() throws Exception {
		System.out.println("开始测试！");
	}

	@Test
	public void test() {
		demo.testSmallString();
	}
	
	@Test
	public void test1() {
		demo.testSmallString1();
	}
	
	@Test
	public void test2() {
		demo.testSmallString2();
	}
	
	@Test
	public void test3() {
		demo.testSmallString3();
	}
	
	@Test
	public void test4() {
		demo.testSmallString4();
	}
	
	@Test
	public void test5() {
		demo.testSmallString5();
	}
	
	@Test
	public void test6() {
		demo.testSmallString6();
	}
	
	@Test
	public void test7() {
		demo.testSmallString7();
	}
	
	@Test
	public void test8() {
		demo.testSmallString8();
	}
	
	@Test
	public void test9() {
		demo.testSmallString9();
	}
	
	@Test
	public void test10() {
		demo.testSmallString10();
	}

}
