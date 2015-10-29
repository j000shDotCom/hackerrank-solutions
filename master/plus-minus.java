import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = 0, neg = 0, zero = 0;
        while(s.hasNextInt()) {
            int a = s.nextInt();
            if(a < 0) ++neg;
            else if(a > 0) ++pos;
            else ++zero;
        }
        System.out.printf("%.4f\n%.4f\n%.4f", (double)pos/n, (double)neg/n, (double)zero/n);
    }
}
