package demopack1;
import java.io.*; 
import java.util.*; 
  
class ProductUsingRecursion
{ 
      
    // recursive function to calculate  
    // multiplication of two numbers 
    static int product(int x, int y) 
    { 
        // if x is less than  
        // y swap the numbers 
       
        // iteratively calculate  
        // y times sum of x 
        if (y != 0) 
            return (x + product(x, y - 1)); 
      
        // if any of the two numbers is  
        // zero return zero 
        else
            return 0; 
    } 
      
    
    public static void main (String[] args) 
    { 
        int x = 2, y = 5; 
        System.out.println(product(x, y));  
    } 
} 