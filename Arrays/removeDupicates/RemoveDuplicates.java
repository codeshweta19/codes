//remove duplicates
 
 
 
 public class RemoveDuplicates {
    public static void main(String[] args) {
         
         int arr[] = {1,2,2,2,3,3,3,3,4,4,5,5,5,5};
         int k = removeDuplicates(arr);
         for( int i=0; i<k ; i++){
            System.out.println(" "+arr[i]);
        }
        }
        
    static int removeDuplicates(int arr[]){
       
       int curr_index = 0;
       for (int iterator = 1; iterator<arr.length ; iterator++)
          {
            if ( arr[curr_index] != arr[iterator]){
              curr_index ++;
              arr[curr_index] = arr[iterator];
          } 
          }      
      
       return curr_index+1;
     
   }  
   } 
   
   
   
    

