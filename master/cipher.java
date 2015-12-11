import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long s = Long.parseUnsignedLong(in.next(), 2);
        
        // set first and last bits
        int xor = 1 & (int)s;
        long ans = (1 << n - 1) ^ xor;
        
        for (int i = 1; i < n - 1; ++i) {
            int sbit = getBit(s, i);
            int s1bit = getBit(s, i-1);
            int nbit = getBit(n, i-1);
            
            int bit;
            if (i <= k) {
                bit = sbit ^ s1bit;
            } else {
                int kbit = getBit(s, i - k);
                bit = sbit ^ s1bit ^ kbit;
            }
            //System.out.printf("%d %d %d %d\n", i, nbit, sbit, bit);
            ans ^= getMask(i, bit);
        }
        System.out.println(Long.toUnsignedString(ans, 2));
    }
    
    private static int getBit(long n, int k) {
        return 1 & (int)(n >> k);
    }
    
    private static long getMask(int k, int bit) {
        return (long) bit << k;
    }
}
