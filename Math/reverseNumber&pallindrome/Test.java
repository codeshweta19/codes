// Reverse digits

public class Test{

 public static void main(String [] args){
   int n = 1221;
   System.out.println("reversed digit is" + reverseDigits(n));
    
    pallindrome(n);
   
   }
   
   static int reverseDigits(int n){
       
       int reverse = 0;
       
       while (n!=0){
         
         reverse = (reverse*10)  + n%10;
         n=n/10;
         
       }  
       return reverse; 
   }



static void pallindrome(int n){
  int temp = n;
  int reverse = 0;
  
  while(n!=0){
   
    int digit = n%10;
    reverse = (reverse * 10) + digit;
    n=n/10;
   }
   
   if(temp == reverse){
          System.out.println("palindrome");
   }
   else{
    System.out.println("not palindrome");
   }
   
 }  
   
}
  
  
