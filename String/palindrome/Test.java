public class Test{
 public static void main(String []args){
    String s = "sStss";
    s = s.toLowerCase();
    if(palidrome(s)){
     System.out.println("yes");
     }
     
     else{
     System.out.println("no");
     }
 }
 
 
 static boolean palidrome(String s){
  
  int i = 0;
  int j = s.length()-1;
  
  while(i<j){
  
   if(s.charAt(i) != s.charAt(j))
     return false;
     
   i++;
   j--;
     
  }
  
  return true;
 
 }
}
