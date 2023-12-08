public class Test {
  public static void main(String[] args){
   int arr[] = {0,1,2,2,3,0,4,2};
   int val=2;
  removeElements(arr,val);
  }
  
  static void removeElements(int arr[],int val){
   
    
        
      int j = arr.length-1;
      
      for(int i=0 ; i>=j ; i++){
        
         if(arr[i] == val){
           
           if(arr[j]==val){
             j--;
           }
           
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
              
         }
      }
       
    for(int i=0 ; i<arr.length ; i++)
    System.out.println(arr[i]);
    
    
 
  }
    
  }

