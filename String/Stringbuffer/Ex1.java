package com.wipro.String.Stringbuffer;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.equalsIgnoreCase(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
