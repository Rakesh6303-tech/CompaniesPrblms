// Write a Java program that:
//    Reads an integer N (number of words).
//    Reads N words as input.
//   Converts each uppercase letter to lowercase and each lowercase letter to uppercase (toggle case).
//    Prints the final toggled string.

// Input : 
//       n =  3
//           Rajesh
//           DEveloper
//            max
// Output : 
//         rAJESH
//         deVELOPER
//          MAX

// Code 
import java.util.*;
public class ToggleCaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first input = number of words
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // read n words
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // toggle case for each word and print on new line
        for (String word : words) {
            StringBuilder toggled = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    toggled.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    toggled.append(Character.toUpperCase(c));
                } else {
                    toggled.append(c);
                }
            }
            System.out.println(toggled.toString()); // print each word separately
        }
    }
}
