import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ad = in.nextInt();
        int am = in.nextInt();
        int ay = in.nextInt();
        int ed = in.nextInt();
        int em = in.nextInt();
        int ey = in.nextInt();
        
        int fine = 0;
        if (ay > ey) {
            fine = 10000;
        } else if (am > em) {
            fine = 500 * (am - em);
        } else if (ad > ed) {
            fine = 15 * (ad - ed);
        }
        System.out.println(fine);
    }
}
