import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] prices = new long[n];
        
        int i = 0;
        while(in.hasNextLong())
            prices[i++] = in.nextLong();
        Arrays.sort(prices);
        
        i = 0;
        while(i < prices.length && k > prices[i])
            k -= prices[i++];
        System.out.println(i);
    }
}
