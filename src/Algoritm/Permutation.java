package Algoritm;

public class Permutation {

     public static  void ofString(String pre, String str){
         int len = str.length();

         if(len == 1)
             System.out.println(pre + str);
         else{
             for(int i = 0; i<len; i++){
                 ofString(pre+str.charAt(i), str.substring(0,i)+str.substring(i+1));
             }
         }
     }
}
