import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNext()) {
            System.out.println(getPalindromeIndex(in.next()));
        }
        in.close();
    }
    
    private static int getPalindromeIndex(String str) {
        int len = str.length();
        for(int i = 0; i <= len / 2; ++i) {
            int j = len - i - 1;
            char a = str.charAt(i);
            char b = str.charAt(j);
            if (a == b)
                continue;
            char nextb = str.charAt(j - 1);
            if (a != nextb)
                return i;
            return j;
        }
        return -1;
    }
}
