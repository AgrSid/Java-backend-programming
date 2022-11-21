package Day10;


	import java.util.Scanner;
	public class exa {

	public static void main(String[] args) {
		String [][] arr=new String [10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st string:");
		String n1=sc.next();
		System.out.println("enter 2nd string:");
		

		String n2=sc.next();
		System.out.println("enter a no of space for first string ");
		int pos=sc.nextInt();
		int hindex=0;
		int vindex=0;
		for(int i=0;i<n1.length();i++)
		{
			for(int j=0;j<n2.length();j++)
			{
				if((n1.codePointAt(i))==(n2.codePointAt(j)))
				{
					hindex=j;
					vindex=i;
					
				}
					
			}
		}
	 
		for(int i=0;i<10;i++)
		{
			for(int x=0;x<10;x++)
			 {
				 if (i==vindex+pos)
				 {
					 if(x>pos && x<n2.length()+pos) {
					 for(int k=pos;k<(n2.length())+pos;k++)
						{
						 
							arr[vindex+pos][k]=n2.valueOf(n2.charAt(k-pos))+" ";
						}}
					 else
					 {
						 arr[vindex+pos][x]="* ";
					 }
						 
				 }
				 else if(x==hindex+pos)
				 {
					 if(i>pos && i<n1.length()+pos) {
						 for(int k=pos;k<(n1.length())+pos;k++)
							{
							 
								arr[k][hindex+pos]=n1.valueOf(n1.charAt(k-pos))+" ";
							}}
					 else
						 arr[i][x]="* ";
					 
				 }
				  
				 else
			      arr[i][x]="* ";
			 }
			
			
		}
		
		for(int i=0;i<10;i++)
		{
			for(int x=0;x<10;x++)
			 { 
				System.out.print(arr[i][x]);
			 }
			
			System.out.println();
		}
	 
	}
	}

