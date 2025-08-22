Write a program to print Only ArmStrong  Numbers otherwise No ArmStrongNumbers
n =  3
 v = 153 370 408
o/p = 153
      370

import java.util.*;
public class Demo{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ar [] = new int [n];
    for(int i=0;i<ar.length;i++)
    {
      ar[i]=scan.nextInt();
    }
    boolean found = false;
    for(int i=0;i<n;i++)
    {
      if(isArmstrong(ar[i]))
      {
        System.out.println(ar[i]);
        found = true;
      }
    }
    if(!found)
    {
      System.out.println("No ArmStrong Numbers Found");
    }
  }
  static boolean isArmstrong(int num)
  {
    int original = num;
    int digits = String.valueOf(num).length();
    int sum = 0;
    while(num!=0)
    {
      int digit = num%10;
      sum += Math.pow(digit,digits);
      num = num/10;
    }
    return sum==original;
  }
}
