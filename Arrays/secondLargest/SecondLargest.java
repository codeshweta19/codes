//Find second largest element in an array
 
 
 
 public class SecondLargest {
    public static void main(String[] args) {
         
         int arr[] = {5,10,8,7,500,4};
         secondLargest(arr);
         
        }
        
    public static void secondLargest(int arr[]){
      
      int first, second;
      first = second = Integer.MIN_VALUE;
      
      for(int i=0; i<arr.length ; i++){
       if (arr[i] > first){
         second = first;
         first = arr[i];
        }
      
      else if (arr[i] > second && arr[i] != first )
        second = arr[i];      
}
    
    if(second == Integer.MIN_VALUE)
     System.out.println("no second largest element");
    else
     System.out.println(second);
     
   }  
   } 
   
    
    
   
