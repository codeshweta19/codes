// move zero to end

public class MoveZerotoend {
  public static void main(String[] args){
   int arr[] = {0,0,0,2,0,5,0,0,6,0,8,0,0};
   move(arr);
  }
  
  static void move(int arr[]){
    int n = arr.length;
    int curr_index = n - 1;
    
    for ( int i = 0 ; i <n ; i++ ){
      if ( arr[i] == 0){
         
         int temp = arr[n-1];
         arr[n-1] = arr[i];
         arr[i] = temp;
         
         n--;
      
      }
      }
      
       for ( int i = 0 ; i < arr.length ; i++ ){
       System.out.println(arr[i]);
       
       }
     }
    
  }


