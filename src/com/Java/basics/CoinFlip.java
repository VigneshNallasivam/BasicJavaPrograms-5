package com.Java.basics;

public class CoinFlip 
{
	public static void main(String[] args) 
	{
		if (Math.random()<0.5)
		{
		     System.out.println("Heads");
		}
       else
       {
            System.out.println("Tails");
       }
		System.out.println("Random Value: " +Math.random());
	}

}
