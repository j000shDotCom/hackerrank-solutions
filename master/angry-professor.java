import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int k = in.nextInt();
            for (int i = 0; i < n; ++i)
                if (in.nextInt() <= 0)
                    --k;
            System.out.println(k <= 0 ? "NO" : "YES");
        }
    }
}
