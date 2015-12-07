import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        in.close();
        int max = 0;
        while (l < r) {
            for(int i = l; i < r; ++i) {
                int xor = l ^ i;
                if (xor > max)
                    max = xor;
            }
            ++l;
        }
        System.out.println(max);
    }
}
