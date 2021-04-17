package demopack1;
import java.util.Scanner;
public class FindingAbsolute
{
	public static void main(String[] args) {
		 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int matrix[][]=new int[1000][1000];
    int a=0,b=0,i,j,sum=0;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<n;i++)
    {
         a=a+matrix[i][i];  
    }
    for(i=0;i<n;i++)
    {
         b=b+matrix[i][n-1-i];
    }
    sum=Math.abs(a-b);
    System.out.println(sum);
	}
}