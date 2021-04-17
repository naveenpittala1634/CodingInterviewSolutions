package demopack1;
import java.util.*; 

class Encryption1
{ 

static String CHARS = "abcdefghijklmnopqrstuvwxyz"; 
static int MAX = 26; 

static void nav(char[] str, int n) 
{ 
	Map<Character, Character> uMap = new HashMap<>(); 
	for (int i = 0; i < MAX; i++) 
	{ 
		uMap. put(CHARS.charAt(i), 
				CHARS.charAt((i + 2) % MAX)); 
	} 
	for (int i = 0; i < n; i++) 
	{ 
		str[i] = uMap.get(str[i]); 
		System.out.print(str[i]);
	} 
	
} 
public static void main(String []args) 
{ 
    Scanner sc=new Scanner(System.in);
	String str = sc.next(); 
	int n = str.length(); 

nav(str.toCharArray(), n); 
} 
}