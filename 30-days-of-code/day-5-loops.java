import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while (in.hasNext()) {
            final int A = in.nextInt();
            final int B = in.nextInt();
            final int N = in.nextInt();
            int sum = 0;
            for (int i = 0; i < N; ++i) {
                sum += B * Math.pow(2, i);
                System.out.print(A + sum + " ");
            }
            System.out.println();
        }
    }
}
