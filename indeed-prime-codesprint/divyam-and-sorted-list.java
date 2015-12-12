import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            final int N = in.nextInt();
            in.nextLine();
            String[] A = in.nextLine().split(" ");
            String[] B = in.nextLine().split(" ");
            boolean seq = findSeq(N, A, B);
            System.out.println(seq ? "YES" : "NO");
        }
    }
    
    private static boolean findSeq(int N, String[] A, String[] B) {
        long curr = Long.MIN_VALUE;
        for(int i = 0; i < N; ++i) {
            long a = Long.parseLong(A[i]);
            long b = Long.parseLong(B[i]);
            long min = Math.min(a, b);
            long max = Math.max(a, b);
            if (curr > min) {
                if (curr > max) {
                    return false;
                } else {
                    curr = max;
                }
            } else {
                curr = min;
            }
        }
        return true;
    }
}
