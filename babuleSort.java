public class javaClass{
public static void main(String [] arguments){
int arr[] ={2,4,6,8,10,6,9,4,5};
int length =arr.length;
System.out.print("UnSorted array :");
for(int i=0;i<length;i++)
System.out.print(arr[i]+ "");
for(int i=0;i<length;i++){
for(int j=1; j<length-i;i++){
if(arr[j-1]> arr[j]);

int temp + arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;


}
}
}
System.out.println();
System.out.print("Sorted array :");
for(int i=0;i<length;i++)
System.out.print("sorted array: "+ arr[i] +"");
}
}
