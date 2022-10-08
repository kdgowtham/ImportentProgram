package org.javaprogram;

public class PalindromString {

	public static void main(String[] args) {
		String name="gowog";
		String rr="";
		for(int i=name.length()-1;i>=0;i--)
		{
		char chr=name.charAt(i);
		rr=rr+chr;
		}
		if(rr.equals(name))
		{
		System.out.println("true"+rr);
		}
		else
		
		System.out.println("Not Palindrom");
	}
	}


