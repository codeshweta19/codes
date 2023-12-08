public class Test{
  public static void main(String [] args){
    int arr[] = {1,2,3,4,6,7,8};
    int N = 8;
    System.out.println(missingnum(arr,N));
          
  }


 static int missingnum(int []arr,int N){
   int summation = N*(N+1)/2;
   int sum = 0;
   
   for (int i=0; i<N-1 ; i++){
     sum += arr[i];
   }
   
   return summation-sum;
 }
} 
