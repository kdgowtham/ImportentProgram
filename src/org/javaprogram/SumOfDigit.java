package org.javaprogram;

public class SumOfDigit {

	public static void main(String[] args)
	{
		
		int a=12345,sum=0;
		int i=0;
		while(a>0)
		{
		i=a/10;
		sum=sum+i;
		a=a/10;
		}
		System.out.println(sum);
		}
	}


