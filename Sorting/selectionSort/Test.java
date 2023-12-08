//selection sort

//select the smallest element and place it at right place by swapping 

public class Test{
 public static void main(String[] args){
   
   int arr[] = { 13, 46, 24, 52,20,9};
   int n= arr.length;
   selectionsort(arr,n);
  }
 
 static void selectionsort(int arr[], int n) {
    
    for(int i = 0; i< n-1 ; i++){
      
      int mini = i;
      for (int j=i+1 ; j< n ; j++){
        if (arr[j] < arr[mini]){
           mini = j;
        }
      }
      
      //swap
      
      int temp = arr[mini];
      arr[mini] = arr [i];
      arr[i] =  temp;
      
    }
    for(int i=0; i<n ; i++)
    System.out .println("  "+arr[i]);
 }
 
 }
 

