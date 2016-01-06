import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        StringBuilder sb = new StringBuilder(N * N + 1);
        for (int i = N - 1; i >= 0; --i) {
            sb.append(repeat(" ", i)).append(repeat("#", N - i)).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
    private static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder(n * s.length());
        while (n-- > 0) {
            sb.append(s);
        }
        return sb.toString();
    }
}
