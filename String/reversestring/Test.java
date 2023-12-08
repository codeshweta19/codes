import java.io.*;

public class Test{
 public static void main(String[]args){

    String str = "shweta";
    String rev_str = "";
   
   for(int i=0 ; i<str.length() ; i++)
        
        rev_str = str.charAt(i) + rev_str;
       System.out.print(rev_str);
  
  }
}
