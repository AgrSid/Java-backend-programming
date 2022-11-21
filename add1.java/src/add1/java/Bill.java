package add1.java;

import java.util.Scanner;

public class Bill {
	  public static void main(String args[])   
	    {     
	         
	        int u ;  
	   
	        double bi = 0;  
	           
	        
	        Scanner sc = new Scanner(System.in);  
	  
	        System.out.println("Enter number of units for calculating electricity bill.");  
	        u = sc.nextInt();  
	  
	       
	        if(u< 100)  
	        {  
	            bi = u * 1.20;  
	        }  
	       
	        else if(u < 300){  
	            bi = 100 * 1.20 + (u - 100) * 2;  
	        }  
	     
	        else if(u > 300)  
	        {  
	            bi = 100 * 1.20 + 200 * 2 + (u - 300) * 3;  
	        }
	        else 
	        {bi = 100* 1.20 +200*2+(u-300)*3+(u-600)*5;
	        }
	        System.out.println("The electricity bill for " +u+ " is : " + bi);   
	    }   
	}



