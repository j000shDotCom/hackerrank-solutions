import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Map<Character,Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(!charCount.containsKey(c))
                charCount.put(c, 1);
            else
                charCount.put(c, charCount.get(c) + 1);
        }
        int oddCount = 0;
        boolean anagramable = true;
        for (int i : charCount.values()) {
            if (i % 2 == 1 && ++oddCount > 1) {
                anagramable = false;
                break;
            }
        }
        System.out.println(anagramable ? "YES" : "NO");
    }
}
