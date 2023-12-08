public class Test {
  public static void main(String[] args){
   int arr[] = {16,17,4,3,5,2};
   leaders(arr);
  }
  
  static void leaders(int arr[]){
    
    int max_of_array = arr[arr.length - 1];
    System.out.print(max_of_array + "  ");
    for(int i =  arr.length - 2 ; i>=0 ;i--){
      if (arr[i] > max_of_array){
        max_of_array = arr[i];
        System.out.print(max_of_array + "  ");
        
        }
    }
    
    
   
  }
    
  }

