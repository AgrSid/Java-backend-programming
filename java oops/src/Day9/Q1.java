package Day9;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q1{
	

	public static void main(String[] args) throws   IOException,FileNotFoundException 
	   {
		FileReader fr= new FileReader("C:\\Users\\Dell\\Desktop\\sid.txt");
		//FileWriter fw= new FileWriter("C:\\Users\\utkar\\Desktop\\CDAC\\dac2.txt");
		
		
		int ch;
		//ch=fr.read();
		int wordc=0;
		//ch=fr.read();
	
		
		while((ch=fr.read())!=-1) {
			{
				if(ch==32||ch==10)
				{
					continue;
				}
				else
				{
					
					wordc++;
				}
				
			}
			//wordc++;
			System.out.println((char)ch);
		//	fw.write(ch);
		}

}}