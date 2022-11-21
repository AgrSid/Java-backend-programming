package add1.java;

import java.util.Scanner;

public class Reversearray {
	
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int  arr1[] = new int[5];
			System.out.println("Enter Elements of an Array");
			for(int i = 0 ; i< 5; i++) {
				arr1[i] = sc.nextInt();
			}
	        System.out.println("Display Elements of an Array");
			for(int i = 0 ; i< 5; i++) {
				System.out.print(" "+arr1[i]);
			}
			System.out.print("\n");
			int arr2[] = new int[5];
			int count =0;
			for(int i = 4 ; i >=0 ; i--) {
				arr2[count++] = arr1[i];
			}
		    System.out.println("Print new array :");
			for(int i = 0 ; i< 5; i++) {
				System.out.print(" "+arr2[i]);
			}
			System.out.print("\n");
				
			
			
		}
	}


