package demopack1;
import java.util.*;
public class Bob {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	
	
	int divide=sc.nextInt();
	int wrappers=sc.nextInt();
	int count1 = 0;
	int choco = (count / divide);
	int remain = 0;
	while (choco != 0)
	{
	count1 =count1+choco;
	int t = (choco + remain) / wrappers;
	remain = choco + remain - t * wrappers;
	choco = t;
	}
	System.out.println(count1);
	}

	
}
