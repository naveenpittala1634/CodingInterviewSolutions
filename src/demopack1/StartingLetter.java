package demopack1;

import java.util.Scanner;

public class StartingLetter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		find(s);
	}
	public static void find(String s)
	{
		char[] ch=s.toCharArray();
		System.out.println(ch[0]);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				System.out.println(ch[i+1]);
			}
		}
	}

}
