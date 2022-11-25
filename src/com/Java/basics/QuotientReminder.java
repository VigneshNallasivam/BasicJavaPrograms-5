package com.Java.basics;

public class QuotientReminder 
{
	public static void main(String[] args) 
	{
	float Quotient=0;
	float Reminder=0;
	int Number=23;
	System.out.println("Enter the Number: "+Number);
	
	Quotient = Number/10;
    System.out.println("Quotient is: "+Quotient);
	
	Reminder = Number % 10;
    System.out.println("Reminder is: "+Reminder);
	}
}
