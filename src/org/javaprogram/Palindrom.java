package org.javaprogram;

public class Palindrom {

	public static void main(String[] args)
	{

		int a=1422;
		int i=0,j=0,n=0;
		n=a;
		while(a>0)
		{
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		}
		if(n==j)
		{
		System.out.println("palindrom"+j);
		}
		else
		{
		System.out.println("not a palindrom"+n);
		}
	}

}
