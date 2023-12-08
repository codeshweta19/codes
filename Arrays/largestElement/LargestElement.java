 
 //Find largest element in an array
 
 public class LargestElement {
    public static void main(String[] args) {
         
         int arr[] = {5,10,8,7,500,4};
         System.out.println("largest element is "+ findLargest(arr));
         
        }
        
    static int findLargest(int arr[]){
      
      int max = arr[0];
      for(int i = 1 ; i< arr.length ; i++)
        if(arr[i] > max)
          max = arr[i];
          
       return max;
     }       
}
