
//Default constructor is called itself even we dint call for super
package demopack1;


class Aaa
{
	Aaa()
	{
		System.out.println("In A class default constructor");
	}
	
}
 class Baa extends Aaa
 {
	
	 Baa()
	 {
		 
		 System.out.println("In B class default constructor");
	 }
 }
 class Constructor1
 {
		
		
		
		public static void main(String[] args)
		{
			Baa b=new Baa();
			
		}

	}