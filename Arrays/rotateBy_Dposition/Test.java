
public class Test{
 public static void main(String [] args){
   
   int[]arr = {1,2,3,4,5,6,7,8};
   int d = 3;
   int n = arr.length;
   leftrotate(arr,n,d);
   System.out.println("after rotation");
   for (int i=0; i<n;i++){
     System.out.print("  "+arr[i]);
   }
 
 }
 
   static void leftrotate(int arr[], int n, int d){
     reverse(arr, 0 , d-1);
     reverse(arr, d, n-1 );
     reverse(arr, 0 , n-1);
     
   }
   
   
   static void reverse(int arr[], int low, int high){
     while(low<high){
     
     int temp = arr[low];
     arr[low] = arr[high];
     arr[high]=temp;
     
     low++;
     high--;
     }
     
   }
   
 
 
}
