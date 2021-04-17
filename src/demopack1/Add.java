//Adding without using + operator..!
//Java Program to add two numbers 
//without using arithmetic operator 


package demopack1;

import java.util.Scanner;

import java.io.*; 

class Add
{ 
	public static void  main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(b!=0)
		{
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		System.out.println(a);
	}
} 
 
