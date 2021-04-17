/*
 In transpose of a matrix rows are converted into columns and columns are converted into rows.
 
 1 2 3 4
 5 6 7 8
 9 1 2 3
 
 o/p:  1 5 9 
       2 6 1
       3 7 2
       4 8 3
       
 System.out.print(arr[j][i]+" ");
 
 
 
 */

//This will be valid only if rows=columns
package demopack1;

import java.util.Scanner;

public class TransposeOfAMatrix1
{
	public static void main(String[] args) 
	{
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
		int temp=0;
		for(int i=0;i<row;i++)
		{
			for(int j=i+1;j<col;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
	}

}
