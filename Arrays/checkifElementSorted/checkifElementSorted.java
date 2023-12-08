public class checkifElementSorted {
    public static void main(String[] args) {
         
         int arr[] = {5,10,12,14,20};
         
         boolean check = sorted(arr);
        
        if(check == true)
         System.out.println("sorted");
           
           else
           System.out.println("not sorted");
         
        }
        
        
     static boolean sorted(int arr[]){
       
       for(int i=1; i<arr.length ; i++)
       
         if (arr[i-1] >arr[i])
           return false;
           
           
          return true;
       
      
   } 
   }
   
