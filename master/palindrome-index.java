import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        while(in.hasNext()) {
            System.out.println(getPalindromeIndex(in.next()));
        }
        in.close();
    }
    
    private static int getPalindromeIndex(String str) {
        int len = str.length();
        for(int i = 0; i < len / 2; ++i) {
            int j = len - i - 1;
            char a = str.charAt(i);
            char b = str.charAt(j);
            if (a == b)
                continue;
            return isPalindrome(str.substring(i, j)) ? j : i;
        }
        return -1;
    }
    
    private static boolean isPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return true;
        return s.charAt(0) == s.charAt(len - 1) && isPalindrome(s.substring(1, len - 1));
    }
}
