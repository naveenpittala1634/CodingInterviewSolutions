/*
 Print it as snake pattern!
 1 2 3
 4 5 6
 7 8 9
 
 o/p: 1 2 3 5 6 4 7 8 9
 */




package demopack1;

import java.util.Scanner;

public class SnakePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i==0||i%2==0)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else if(i%2!=0)
			{
				for(int j=arr[i].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
				
			}
		    
		}
		
	}
}
