import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = BigInteger.valueOf(in.nextInt());
        BigInteger b = BigInteger.valueOf(in.nextInt());
        BigInteger res = BigInteger.ONE;
        int n = in.nextInt();
        while(n-- > 2) {
            res = a.add(b.pow(2));
            a = b;
            b = res;
        }
        System.out.println(res);
    }
}
