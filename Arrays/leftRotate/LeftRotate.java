//left rotate
 
 
 
 public class LeftRotate {
    public static void main(String[] args) {
         
         int arr[] = {1,3,45,6,7,8,0};
         leftrotate(arr);
         }
        
    static  void leftrotate(int arr[]){
       
       int temp = arr[0];
       
       for (int i = 1 ; i< arr.length ; i++){
          arr[i-1] = arr[i];
          
       }   
        
        arr[ arr.length-1]=temp;
        for (int i = 0 ; i< arr.length ; i++)
        System.out.println(" " + arr[i]);
   } 
   } 
   
   
   
    

