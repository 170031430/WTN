package com.wipro.String.Stringbuffer;

public class Ex7 {
	public static void main(String[] args) {
		String str = "xHix";
		
		if (str.charAt(0) == 'x')
			str = str.substring(1, str.length());
		
		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);
		
		System.out.println(str);

}
}
