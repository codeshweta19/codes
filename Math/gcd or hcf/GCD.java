public class GCD{
public static void main(String[] args){
   
   int a=18, b=6;
    int ans = 1;
   for(int i=1 ; i <= Math.min(a , b) ; i++){
     if (a%i == 0 && b%i == 0){
        ans = i;
     }
     }
     System.out.println("GCD is" +ans);
     
     System.out.println ("gcd is" + gcd(a,b));
     
     }
     //////////////////////
     //Eucledian theorem or division method//
     
     
 static int gcd(int a, int b){
    if(b==0)
     return a;
     
    return gcd(b, a%b); 


   
   }

}
