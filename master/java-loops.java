import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        while(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            
            for (int i = 0; i < n; ++i) {
                a += b * Math.pow(2, i);
                System.out.print(a + (i == n - 1 ? "\n" : " "));
            }
        }
        s.close();
    }
}
