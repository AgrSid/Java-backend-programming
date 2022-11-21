package add1.java;

import java.util.Scanner;

public class Maxmin {
	

		public static void main(String[] args ) {
			
			Scanner sc = new Scanner(System.in);
			
			int array[] = new int[5];
			
			for(int i = 0 ; i < 5; i++) {
				array[i] = sc.nextInt();
			}
		    int max = array[0];
			int min = array[0];
			for(int i = 1 ; i < 5 ; i++ ) {
				
				if (max < array[i]) max = array[i];
				if (min > array[i]) min = array[i];
			}
		     for(int i = 0 ; i < 5 ;i++) {
				System.out.print(" "+array[i]);
			}
			System.out.println(" ");
			
			System.out.println("Maximum number : "+max+" Minimum number : "+min);
			
		}
	}

