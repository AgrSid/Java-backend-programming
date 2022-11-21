package add1.java;

import java.util.Scanner;

public class Sumofarray {
public static void Sumofarray(int suma[] , int size) {
		
		int sum=0;
		for(int i = 0 ; i <size; i++) {
			sum = sum+  suma[i];
		}
		System.out.println("Sum of number is : "+sum);
	}
	public static void display(int aa[] , int size) {
		
		for (int i = 0 ; i< size ; i++) {
			System.out.println(aa[i]);
		}
	}
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arrayofnum[] = new int[size];
		
		System.out.println("Enter Element to array");
		for(int i = 0 ; i < size; i++) {
			arrayofnum[i] = sc.nextInt();
			}
		display(arrayofnum, size);
		Sumofarray(arrayofnum,size);
	}

}
