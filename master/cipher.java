import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long s = Long.parseUnsignedLong(in.next(), 2);
        
        /*
        StringBuilder bu = new StringBuilder(num.length() * 2);
        for(char c : num.toCharArray())
            bu.append(c).append(' ');
        String numSpaced = bu.toString().trim();
        for(int i = 0; i < k; ++i)
            System.err.printf("%"+(2*bu.length()+k+2*i)+"s\n", numSpaced);
        */
        
        long mask = (1 << n) - 1;
        long ans = 0;
        while(k-- > 0) {
            ans ^= (s & mask);
            s >>= 1;
        }
        
        /*
        long ans = 0;
        int xor = 0;
        for(int i = 0; b > 0; ++i) {
            boolean bit = 1 & b;
            xor |= bit << i;
            b = b >> 1;
        }
        */
        System.out.println(Long.toUnsignedString(ans, 2));
    }
}
