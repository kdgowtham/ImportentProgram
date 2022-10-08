package org.javaprogram;

public class AmstrongNumbers {

	public static void main(String[] args)
	{
		for(int k=1;k<=1000;k++)
		{
			int a=k;
			int i=0;
			int j=0,n=0;
			 n=a;
			while(a>0)
			{
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
			}
			if(n==j)
			{
			System.out.println("Amstrong="+j);
			}
//			else
//			{
//			System.out.println("not");
			}

	}
		}


