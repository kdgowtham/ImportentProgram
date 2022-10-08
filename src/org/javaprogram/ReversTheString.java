package org.javaprogram;

public class ReversTheString {

	public static void main(String[] args) {
		String name="gowtham";
		String res="";
		for(int i=name.length()-1;i>=0;i--)
	
		
		{
		char chr=name.charAt(i);
		res =res+chr;

		}
		System.out.println(res);


	}

}
