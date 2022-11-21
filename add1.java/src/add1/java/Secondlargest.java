package add1.java;

import java.util.Scanner;

public class Secondlargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  arr1[] = new int[5];
		System.out.println("Enter Elements of an Array");
		for(int i = 0 ; i< 5; i++) {
			arr1[i] = sc.nextInt();
		}
		int tempo = 0;
		for (int i = 0; i < 5; i++)   
        {  
            for (int j = i + 1; j < 5; j++)   
            {  
                if (arr1[i] > arr1[j])   
                {  
                    tempo = arr1[i];  
                    arr1[i] = arr1[j];  
                    arr1[j] = tempo;  
                }  
            }  
        } 
		System.out.println("Display Elements of an Array");
		for(int i = 0 ; i< 5; i++) {
			System.out.print(" "+arr1[i]);
		}
		System.out.print("\n");
		
		
		System.out.println("Maximum number : "+arr1[4]+" Second Maximum number : "+arr1[3]);
		
	}
}
