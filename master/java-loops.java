import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        while(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            
            int sum = a;
            for (int i = 0; i < n; ++i) {
                sum += b * 2^i;
                System.out.print(sum + (i == n - 1 ? "\n" : " "));
            }
        }
        s.close();
    }
}
