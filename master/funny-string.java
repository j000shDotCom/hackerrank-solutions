import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        while(in.hasNext()) {
            String s = in.next();
            boolean funny = true;
            int len = s.length();
            for(int i = 1; funny && i < len; ++i) {
                int forw = Math.abs((int)s.charAt(i-1) - (int)s.charAt(i));
                int back = Math.abs((int)s.charAt(len-i) - (int)s.charAt(len-i-1));
                funny &= forw == back;
            }
            System.out.println(funny ? "Funny" : "Not Funny");
        }
    }
}
