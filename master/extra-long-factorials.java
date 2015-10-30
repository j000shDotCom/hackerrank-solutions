import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        BigInteger l = BigInteger.valueOf(1);
        for(int i = 2; i <= n; ++i) {
            l = l.multiply(BigInteger.valueOf(i));
        }
        System.out.println(l);
    }
}
