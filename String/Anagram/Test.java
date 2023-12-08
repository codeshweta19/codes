import java.io.*;
import java.util.*;

public class Test{
 static int NO_OF_CHARS = 256;
 public static void main(String []args){
   char[] str1 = ("geeks").toCharArray();
   char[] str2 = ("sgeek").toCharArray();
   
    if(areAnagram(str1, str2)){
     System.out.println("yes");
     }
     
     else{
     System.out.println("no");
     }
 }
 
 
 static boolean areAnagram(char[] str1, char[] str2){
  
  int count1[] = new int[NO_OF_CHARS];
  int count2[] = new int[NO_OF_CHARS];
  
  Arrays.fill(count1 , 0);
  Arrays.fill(count2 , 0);
  
  int i;
  for(i=0 ; i < str1.length && i< str2.length ; i++){
    count1[str1[i]]++;
    count2[str2[i]]++;
    
    if(str1.length != str2.length)
      return false;
      
  for(i=0 ; i < NO_OF_CHARS ; i++)
    if(count1[i] != count2[i])
      return false;    
    
 
  } 
   return true;  
  
  
  
 
 }
}
