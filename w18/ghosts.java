import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long count = solveBruteForce(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(count);
    }
    
    public static long solveBruteForce(int a, int b, int c, int d) {
        long count = 0;
        for (int town = 0; town < a; ++town)
            for (int street = 0; street < b; ++street)
                for (int house = 0; house < c; ++house)
                    for (int apt = 0; apt < d; ++apt)
                        if (cond(town + 1, street + 1, house + 1 , apt + 1)) {
                            ++count;
                        }
        return count;
    }
    
    public static boolean cond(int town, int street, int house, int apt) {
        long gcd = (town < apt) ? gcd(town, apt) : gcd(apt, town);
        return ((town - street) % 3 == 0)
            && ((street + house) % 5 == 0)
            && ((town * house) % 4 == 0)
            && (gcd == 1);
    }
    
    public static long gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
