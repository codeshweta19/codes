import java.util.*;

public class Test{
  public static void main(String [] args){
    int n = 163;
    
    if(isArmstrong(n)){
    System.out.println("Armstrong");
    }
    
    else{
    System.out.println("not Armstrong");
    }
  }
  
  
   static boolean isArmstrong(int n){
    
    int org_no = n;
    int temp = n;
    int count =0;
    
    while(temp!=0){
     count ++;
     temp = temp/10;
    }
    
    int sumofPower = 0;
    while( n!=0){
     int digit = n%10;
     sumofPower += Math.pow(digit,count);
     n=n/10;
    }
    
    return (sumofPower == org_no);
   }

}
