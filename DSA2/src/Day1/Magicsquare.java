package Day1;



public class Magicsquare {
	 static boolean Magicsquare(int mat[][])
	{
	int sum1=0;
	int sum2=0;
	for(int i=0; i<3;i++)
	{	sum1+=mat[i][i];
	sum2+=mat[i][2-i];
	
	}
	if(sum1!=sum2)
	{
		return false;
	}
	for(int i=0;i<3;i++) {
		int rowsum=0;
		int colsum=0;

		{for (int j=0;j<3;j++)
			{rowsum+=mat[i][j];
			colsum+=mat[j][i];
			
			}
		}return true;
	
	
		}
	return false;
    
	}
public static void main(String[] args) {
	int mat[][]= {{2,7,6},{9,5,1},{4,3,8}};
	if (Magicsquare(mat)) 
		System.out.println("magic square");
	
	else
		System.out.println("not magic square");
}	 
}

