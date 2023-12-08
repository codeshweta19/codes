 public class Test {
    public static void main(String[] args) {
         
         int arr[] = {2,1,4,2,1};
         System.out.println("single element is "+ singleElement(arr));
         
        }
        
    static int singleElement(int arr[]){
      
      int xorr = 0;
     for(int i = 0 ; i < arr.length ; i++){
       xorr = xorr ^ arr[i];
     }
     
     return xorr;
     
     }
   }       
