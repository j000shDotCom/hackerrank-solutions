import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextLong()) {
            int count = 0;
            final long num = in.nextLong();
            long n = num;
            while(n > 0) {
                long d = n % 10;
                if (d != 0 && num % d == 0)
                    ++count;
                n /= 10;
            }
            System.out.println(count);
        }
    }
}
