// count digits

public class Test{

 public static void main(String [] args){
   int n = 123456666;
   
   
   int temp = n , count = 0;
   while(n!=0){
      
      n = n/10;
      count++;
   }
   
   System.out.println(count);
 
 }
}



////////////////////////////

Solution 2 : 
  Convert the integer into a string.
   Find the length of the string      
   
   
   import java.util.*;
public class tUf {
  static int count_digits(int n) {
    String n2 = Integer.toString(n);
    return n2.length();
  }

  public static void main(String args[]) {
    int n = 12345;
    System.out.println("Number of digits in " + n + " is " + count_digits(n));
  }
}


 Solution 3
 
 
Use logarithm base 10 to count the number of digits. As

The number of digits in an integer = the upper bound of log10(n).

Example :

n = 12345
log10(12345) = 4.091
Integral part of 4.091 is 4 and 4 + 1 =  5 which is also the number of digits in 12345  




import java.util.*;
public class tUf { 
    static int count_digits(int n)
    {
       int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    } 

    public static void main(String args[]) 
    { 
         int n = 12345;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    } 
}             
