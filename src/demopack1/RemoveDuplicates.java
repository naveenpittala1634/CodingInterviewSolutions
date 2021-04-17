package demopack1;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			hs.add(arr[i]);
		}
	 
		System.out.println(hs);
	}
}
