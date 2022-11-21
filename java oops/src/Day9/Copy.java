package Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
public static void main(String[] args) throws IOException,FileNotFoundException {
	FileInputStream fis= new FileInputStream("a");
	FileOutputStream fos= new FileOutputStream("b");
	int i = 0;
	while (fis.read() != -1)
		fos.write(i);
	
     fis.close();
     fos.close();
	
	
}
}
