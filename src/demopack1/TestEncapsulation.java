/*
 Encapsulation is defined as the wrapping up of data under a single unit.
  It is the mechanism that binds together code and the data it manipulates.
   Another way to think about encapsulation is, it is a protective shield that prevents the data from 
   being accessed by the code outside this shield.

Technically in encapsulation, the variables or data of a class is hidden from any other class 
and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
Encapsulation can be achieved by Declaring all the variables in the class as private and writing public 
methods in the class to set and get the values of variables.
 */
// Java program to demonstrate encapsulation 
package demopack1;

 class Encapsulation { 

	// private variables declared 
	// these can only be accessed by 
	// public methods of class 
	private String geekName; 
	private int geekRoll; 
	private int geekAge; 

	// get method for age to access 
	// private variable geekAge 
	public int getAge() 
	{ 
		return geekAge; 
	} 

	// get method for name to access 
	// private variable geekName 
	public String getName() 
	{ 
		return geekName; 
	} 

	// get method for roll to access 
	// private variable geekRoll 
	public int getRoll() 
	{ 
		return geekRoll; 
	} 

	// set method for age to access 
	// private variable geekage 
	public void setAge(int newAge) 
	{ 
		geekAge = newAge; 
	} 

	// set method for name to access 
	// private variable geekName 
	public void setName(String newName) 
	{ 
		geekName = newName; 
	} 

	// set method for roll to access 
	// private variable geekRoll 
	public void setRoll(int newRoll) 
	{ 
		geekRoll = newRoll; 
	} 
} 

// Class to access variables 
// of the class Encapsulate 
class TestEncapsulation { 
	public static void main(String[] args) 
	{ 
		Encapsulation obj = new Encapsulation(); 

		// setting values of the variables 
		obj.setName("Harsh"); 
		obj.setAge(19); 
		obj.setRoll(51); 

		// Displaying values of the variables 
		System.out.println("Geek's name: " + obj.getName()); 
		System.out.println("Geek's age: " + obj.getAge()); 
		System.out.println("Geek's roll: " + obj.getRoll()); 

		// Direct access of geekRoll is not possible 
		// due to encapsulation 
		// System.out.println("Geek's roll: " + obj.geekName); 
	} 
} 
