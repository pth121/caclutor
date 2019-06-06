package demo;

public class StringDemo {
	
	public StringDemo() {
	}
	
	public String smallString(String str) {
		// TODO Auto-generated method stub
		String temp = "error";
		if (str.equals("") || str == "null") {
			return temp;
		}
		String s = str.toLowerCase();
		return s;
	}
}
