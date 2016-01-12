import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            in.nextLine();
            char[][] arr = new char[n][];
            for (int i = 0; i < n; ++i) {
                arr[i] = in.nextLine().toCharArray();
                Arrays.sort(arr[i]);
            }
            boolean valid = true;
            for (int i = 0; i < n && valid; ++i) {
                for (int j = 1; j < n && valid; ++j) {
                    valid &= arr[j-1][i] <= arr[j][i];
                }
            }
            System.out.println(valid ? "YES" : "NO");
        }
    }
}
