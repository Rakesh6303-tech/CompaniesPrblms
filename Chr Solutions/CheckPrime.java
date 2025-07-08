// Check a Number is Prime or Not
import java.util.*;
public class Demo{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    checkprime(n);
  }
  static void checkprime(int n)
  {
    int count=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        count++;
      }
    }
    if(count==2)
    {
      System.out.print("Prime");
    }
    else{
      System.out.print("Not Prime");
    }
  }
}
