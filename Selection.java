public class JavaSelection{
public static void main(String[]arg){
int arr[]={2,24,14,7,55};
int length-arr.length;
System.out.print("unsorted array: ");
for(int i=0;i<lrngth;i++)
System.out.println(arr[i]+"");

for(int i=0;i<lenth-1;i++){
int min_index + i;
for(int j=i+1;j<length;j++){
if(arr[min_index] >arr[j])
min_index = j;


}
int temp = arr[min_index];
arr[min_index] = arr[i];
arr[i]=temp;





}
System.out.println();
System.out.println("sorted array : ");
for(int i=0;i<lrngth;i++)
System.out.println(arr[i]+"");

}
}
