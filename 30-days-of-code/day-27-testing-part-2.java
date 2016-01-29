import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int t = in.nextInt();
            while(n > 0) {
                if (in.nextInt() <= 0)
                    t--;
            }
            System.out.println(t >= 0 ? "YES" : "NO");
        }
    }
}
