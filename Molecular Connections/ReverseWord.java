// This Question Was Asked at Moleular Connections 
Example : input  :cat,banana,apple
output : cat,apple,banana
  
import java.util.*;
public class ReversePartial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine(); // e.g. cat,banana,apple
        String[] words = input.split(",");

        // Reverse from index 1 to end
        int left = 1;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        System.out.println(String.join(",", words));
    }
}
