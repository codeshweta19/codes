
 
 
 
 public class Test {
    public static void main(String[] args) {
         
         int arr[] = {2,3,10,6,4,8,1};
         int n = arr.length;
         System.out.println(maxDifference(arr,n));
         
        }
        
    public static int maxDifference(int arr[],int n){
      
    int max_diff = arr[1] - arr[0];
    int min_value = arr[0];
    
    for(int i = 1 ; i < n ; i++){
       
       if(max_diff < arr[i] - min_value)
         max_diff = arr[i] - min_value;
         
       if(arr[i] < min_value)  
          min_value = arr[i];
    
    }
    
    return max_diff;
     
   }  
   } 
   
    
    
   
