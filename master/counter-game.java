import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextLong()) {
            boolean turns = play(in.nextLong(), true);
            System.out.println(turns ? "Loise" : "Richard");
        }
        in.close();
    }
    
    private static boolean play(long n, boolean currPlayer) {
        if (n == 1L)
            return !currPlayer;
        long p = getPow(n); // TODO could memoize
        return play((p == 0 ? (n / 2) : (n - p)), !currPlayer);
    }
    
    // [0] n is a power of two
    // [1,LONG_MAX - LONG_MAX >> 1] next power of two greater than n
    private static long getPow(long n) {
        long pow = 1L;
        while(pow < n) {
            pow = pow << 1;
        }
        return pow == n ? 0 : pow >> 1;
    }
}
