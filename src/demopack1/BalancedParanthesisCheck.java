package demopack1;

import java.util.*;
class BalancedParanthesisCheck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		BalancedParanthesisCheck obj=new BalancedParanthesisCheck();
		System.out.print(obj.parenthesis(s));
	}
	boolean parenthesis(String s)
	{
		Stack<Character> st=new Stack<>();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='{' || arr[i]=='[' || arr[i]=='(')
			{
				st.push(arr[i]);
			}
			if(arr[i]=='}' || arr[i]==']' || arr[i]==')')
			{
				if(st.isEmpty())
				{
					return false;
				}
				else if(!ismatching(st.peek(),arr[i]))
				{
					return false;
				}
				else st.pop();
		    }
	    }
		if (st.isEmpty()) 
         return true; 
       else
         {  
             return false; 
         }  
    }
	boolean ismatching(char ch,char ch1)
	{
		if(ch=='{' && ch1=='}')
			return true;
	    else if(ch=='[' && ch1==']')
			return true;
		else if(ch=='(' && ch1==')')
			return true;
		else
			return false;
	}
}