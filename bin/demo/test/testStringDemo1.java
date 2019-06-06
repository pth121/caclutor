package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo1 extends TestCase {
		
	private StringDemo str;
		
	protected void setUp(){
		str = new StringDemo();
	}
	
	
	public void testSmallString1() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString(""),"error");	
	}
	
	public void testSmallString2() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("null"),"error");	
	}
	
	public void testSmallString3() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("12a"),"12a");	
	}
	
	public void testSmallString4() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("1A"),"1a");	
	}
	
	public void testSmallString5() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("ahj1N"),"ahj1n");	
	}
	
	public void testSmallString7() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("AN"),"an");	
	}
	
	public void testSmallString8() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("B1B"),"b1b");	
	}
	
	public void testSmallString9() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("A1b"),"a1b");	
	}
	
	public void testSmallString10() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("ABCD"),"abcd");	
	}

	public void testSmallString6() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("AZ"),"az");	
	}

	public void testSmallString() {
		// TODO Auto-generated method stub
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
}
