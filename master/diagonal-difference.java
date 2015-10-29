import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d0 = 0, d1 = 0;
        for(int r = 0; r < n; ++r) {
            int[] nums = new int[n];
            for(int i = 0; i < n; ++i) {
                nums[i] = s.nextInt();
            }
            d0 += nums[r];
            d1 += nums[n-r-1];
        }
        System.out.println(Math.abs(d0 - d1));
        s.close();
    }
}
