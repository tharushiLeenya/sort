package Algorithm2;

public class Insertion{
 

	public static void main(String[] args) {
		int arr[] ={2,4,7,8,10,6,9,4,5};
		int length = arr.length;

		System.out.print("Unsorted array :");
		for(int i=0;i<length;i++) {
		System.out.print(arr[i] + " ");

		for(int i=1;i<length;i++){
		int key =arr[i];
		int j = i - 1;
		 

		while(j >= 0 && arr[j]> key){
		arr[j+1]= arr[j];
		j=j-1;
		}

		arr[j+1]= key;
		}
		
		
		System.out.println();
		System.out.print("sorted array :");
		for(int i=0;i<length;i++)
		System.out.print(arr[i] +" ");
		}
		
	
		// TODO Auto-generated method stub
}
	

} 
