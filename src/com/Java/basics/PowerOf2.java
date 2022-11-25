package com.Java.basics;
import java.util.Scanner;
public class PowerOf2 
{
	public static void main(String[] args) 
	   {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = scanner.nextInt(); 
		
		while(number % 2 ==0)
		{
			number = number/2;
		}
		
		if(number == 1)
			System.out.println("The Given Number Is Power of 2");
		else
			System.out.println("The Given Number Is NOT Power of 2");
		}
}
