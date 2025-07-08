Example : arr [1,2,0,9,3,0,8,0,4,3,9]
output : 1,2,9,3,8,4,3,9,0,0,0
// Above Question Was Asked During Technical Interview 1 at 42Gears Company
  // Code

  import java.util.*;
public class Demo{
  public static void main(String args [])
  {
   // Scanner scan = new Scanner(System.in);
   int ar [] = {0,2,3,1,0,5,0,3,5,0};
   int index = 0;
   for(int num:ar)
   {
     if(num!=0)
     {
       ar[index]=num; //ar[0]=2,ar[1]=3,ar[2]=1;
       index++;   // index will be incremented
     }
   } // Remaining values from index length like 4,5,6
   while(index<ar.length)
   {
     ar[index]=0; // 0 are stored at the End
     index++;      // Index will be incremented
   }
   for(int num:ar)  // print the Final output
   {
     System.out.print(num);
   }
  }
}
