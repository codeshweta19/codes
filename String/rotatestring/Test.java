public class Test{
 public static void main(String[]args){

    String str = "shweta";
    String rot_str = "";
    char first_ele = str.charAt(0);
   
   for(int i=1 ; i<str.length() ; i++)
        
        rot_str =  rot_str + str.charAt(i);
       System.out.print(rot_str+first_ele);
  
  }
}
