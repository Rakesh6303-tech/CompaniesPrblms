// print 1 to 100 without using loops
import java.util.*;
public class Main {
  public static void printNum(int n){
     if(n>100)return;   
       System.out.println(n+" ");
       printNum(n+1);
  }
    public static void main(String args []){
      printNum(1);
       
  }

}
