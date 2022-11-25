package com.Java.basics;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		double number = 50;
		double sum=0;	
		for(int i=1;i<=number;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);
	}
}
