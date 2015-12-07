import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int res = x;
            while(x++ < y)
                res &= x;
            System.out.println(res);
        }
    }
}
