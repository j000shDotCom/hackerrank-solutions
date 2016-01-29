import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        while(in.hasNext()) {
            String s = in.next();
            boolean funny = true;
            int l = s.length() - 1;
            for(int i = 0; funny && i < l / 2; ++i) {
                int a = Math.abs(s.charAt(i) - s.charAt(i + 1));
                int b = Math.abs(s.charAt(l - i) - s.charAt(l - 1 - i));
                funny &= a == b;
            }
            System.out.println(funny ? "Funny" : "Not Funny");
        }
    }
}
