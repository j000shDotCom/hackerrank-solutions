import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        int[] arr = new int[N];
        
        int n = N;
        while(n-- > 0)
            arr[n] = in.nextInt();
        Arrays.sort(arr);
        
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < N; ++i) {
            int abs = Math.abs(arr[i-1] - arr[i]);
            if (abs < diff)
                diff = abs;
        }
        
        for (int i = 1; i < N; ++i) {
            int abs = Math.abs(arr[i-1] - arr[i]);
            if (abs == diff)
                System.out.printf("%d %d ", arr[i-1], arr[i]);
        }
    }
}
