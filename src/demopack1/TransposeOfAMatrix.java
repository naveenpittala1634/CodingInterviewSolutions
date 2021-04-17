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


package demopack1;

import java.util.Scanner;

public class TransposeOfAMatrix 
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
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
			
		}
	}

}
