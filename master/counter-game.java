import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNext()) {
            boolean p1 = thing(new BigInteger(in.next(), 10));
            System.out.println(p1 ? "Louise" : "Richard");
        }
        in.close();
    }
    
    private static boolean thing(BigInteger n) {
        return n.bitCount() / 2 == 0;
    }
    
    private static boolean play(BigInteger n) {
        boolean p1 = true;
        while(n.compareTo(BigInteger.ONE) >= 0) {
            //System.out.printf("%30s %10d %10d\n", n.toString(), n.bitCount(), n.bitLength());
            if (n.bitCount() == 1)
                return p1 & (n.bitLength() % 2 == 0);
            n = n.clearBit(n.bitLength() - 1);
            p1 = !p1;
        }
        return !p1;
    }
}
