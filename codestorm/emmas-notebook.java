import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        int sum = 1;
        for (int i = 2, inc = 1; i <= t; ++i) {
            if (i % 2 == 0) {
                ++inc;
            }
            sum += inc;
        }
        System.out.println(sum);
    }
}
