import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long sum = getNextLong(in);
            for(int i = 0; i < a + b; ++i) {
                long next = getNextLong(in);
                long and = sum & next;
                long or = sum | next;
                sum = (Long.compareUnsigned(and, or) >= 0 ? and : or);
            }
            System.out.println(sum);
        }
    }
    
    private static long getNextLong(Scanner s) {
        return Long.parseUnsignedLong(s.next());
    }
}
