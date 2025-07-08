// 1st Round is written Test consists of 5 Problems             [08-7-2025 Banashankari]
Example : s1 = "listen"
          s2 = "silent"
output : true
  import java.util.*;
public class Demo{
  public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    String s1 = scan.nextLine();
    String s2 = scan.nextLine();
    if(checkAnagram(s1,s2))
    {
      System.out.print("True");
    }
    else{
      System.out.print("false");
    }
  }
  static Boolean checkAnagram(String s1,String s2)
  {
    if(s1.length()!=s2.length())
    {
      return false;
    }
    char [] array1 = s1.toCharArray();
    char [] array2 = s2.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);
      return Arrays.equals(array1,array2);
  }  
}
  
