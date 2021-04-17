/*
 Data Abstraction is the property by virtue of which only the essential details are displayed to the user. 
 The trivial or the non-essentials units are not displayed to the user. 
 Ex: A car is viewed as a car rather than its individual components.

Data Abstraction may also be defined as the process of identifying only the required characteristics 
of an object ignoring the irrelevant details. The properties and behaviours of an object differentiate 
it from other objects of similar type and also help in classifying/grouping the objects.
 */


// Java program to illustrate the concept of Abstraction 


package demopack1;
abstract class Shape { 
	String color; 

	// these are abstract methods 
	
	abstract double area(); 
	public abstract String toString(); 

	// abstract class can have a constructor 
	public Shape(String color) 
	{ 
		System.out.println("Shape constructor called"); 
		this.color = color; 
	} 

	// this is a concrete method 
	public String getColor() 
	{ 
		return color; 
	} 
} 
class Circle extends Shape { 
	double radius; 

	public Circle(String color, double radius) 
	{ 

		// calling Shape constructor 
		super(color); 
		System.out.println("Circle constructor called"); 
		this.radius = radius; 
	} 

	@Override
	double area() 
	{ 
		return Math.PI * Math.pow(radius, 2); 
	} 

	@Override
	public String toString() 
	{ 
		return "Circle color is "
			+ super.color 
			+ "and area is : "
			+ area(); 
	} 
} 

class Rectangle extends Shape { 

	double length; 
	double width; 

	public Rectangle(String color, 
					double length, 
					double width) 
	{ 

		// calling Shape constructor 
		super(color); 
		System.out.println("Rectangle constructor called"); 
		this.length = length; 
		this.width = width; 
	} 

	@Override
	double area() 
	{ 
		return length * width; 
	} 

	@Override
	public String toString() 
	{ 
		return "Rectangle color is "
			+ super.color 
			+ "and area is : "
			+ area(); 
	} 
} 

public class Abstraction { 
	public static void main(String[] args) 
	{ 
		Shape s1 = new Circle("Red", 2.2); 
		Shape s2 = new Rectangle("Yellow", 2, 4); 

		System.out.println(s1.toString()); 
		System.out.println(s2.toString()); 
	} 
} 
