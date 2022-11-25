package com.Java.basics;
import java.util.Scanner;
public class PrimeFactors 
{
	public static void main(String[] args)
	{
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a number=");
	      int Number = scanner.nextInt();
	      int i;
	      for(i=2;i<Number;i++) 
	      {
	         while(Number % i == 0) 
	         {
	            System.out.println(i+" ");
	            Number = Number/i;
	         }
	      }
	      if(Number>2) 
	      {
	         System.out.println(Number);
	      }

	}

}
