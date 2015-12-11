import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt()) {
            final int A = in.nextInt();
            final int B = in.nextInt();
            
            long count = 0;
            for (int i = A; i <= B; ++i) {
                int temp = i;
                while (temp != 0) {
                    if ((1 & temp) == 1)
                        ++count;
                    temp >>>= 1;
                }
            }
            System.out.println(count);
        }
    }
}

