package demopack1;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
				
				
				
			}
			else
			{
				hm.put(s.charAt(i),1);
			}
				
		}
		for(int i=0;i<s.length();i++)
		{
			if(hm.get(s.charAt(i))==1)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
		}

}
