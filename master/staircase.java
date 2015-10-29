import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                sb.append(' ');
            }
            for (int j = 0; j < i+1; ++j) {
                sb.append('#');
            }
            if (i != n-1)
                sb.append('\n');
        }
        System.out.println(sb);
    }
}
