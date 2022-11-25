package com.Java.basics;
import java.util.Scanner;
public class LargestAmongThreeNumber 
{
	public static void main(String[] args) 
	{
	Scanner scanner=new Scanner(System.in);
	int A=scanner.nextInt();
	System.out.println("Enter A=");
	int B=scanner.nextInt();
	System.out.println("Enter B=");
	int C=scanner.nextInt();
	System.out.println("Enter C=");
	
                   //Nested if-else
    if(A>=B) 
    {
        if(A>=C)
            System.out.println(A + " is the largest number.");
        else
            System.out.println(C + " is the largest number.");
    } 
               
                   //Nested if-else
    else 
    {
        if(B>=C)
            System.out.println(B + " is the largest number.");
        else
            System.out.println(C + " is the largest number.");
    }

	}

}
