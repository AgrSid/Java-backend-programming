package Practice;

public class Quicksortrecursion {
int partition(int []arr,int low,int high)
{
	int pivot=arr[high];
	int i=low;
	int j=low;
	while(i<=high) {
	
		if(arr[i]<=pivot) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}i++;
	}return j-1;
}
public void sort(int[]arr,int low,int high){
	if(low<high) {
	int p=partition(arr,low,high);
	sort( arr,low,p-1);
	sort( arr,p+1,high);
			
	}
}
public static void main(String[] args) {
	Quicksortrecursion s=new Quicksortrecursion();
	int[] arr= {5,2,6,1,9,8,4};
	s.sort(arr, 0,6);
	
}
}
