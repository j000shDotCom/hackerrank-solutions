import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println(find_gcd(in.nextInt(), in.nextInt()));
    }
    static int find_gcd(int a, int b) {
        if (a == b)
            return a;
        int min = Math.min(a, b);
        return find_gcd(Math.max(a, b) - min, min);
    }
}

