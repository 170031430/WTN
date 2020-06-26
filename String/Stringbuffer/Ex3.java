package com.wipro.String.Stringbuffer;

public class Ex3 {
	static String charCopy(String s,int n) {
		String res="";
		if(n<2)
			return s;
		else {
			s=s.substring(0,2);
			while(n!=0) {
				res=res.concat(s);
			n--;
			}
			return res;
		}
	}
public static void main(String[] args) {
	String s="Wipro";
	int n=s.length();
	System.out.print(charCopy(s,n));
}
}
