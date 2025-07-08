Example : "programming"
  output : progamin

  // Code
  import java.util.*;
public class Duplicates{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    RemoveDuplicate(s);
  }
  static void RemoveDuplicate(String s)
  {
    Set<Character> set = new LinkedHashSet<Character>();
    // Converted String to Character
    for(char ch:s.toCharArray())
    {
      set.add(ch);
    }
    for(char v:set)
    {
      System.out.print(v);
    }
  }
}
