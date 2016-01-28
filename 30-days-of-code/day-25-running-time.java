import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt()) {
            int n = in.nextInt();
            Double sqrt = Math.sqrt(n);
            boolean prime = n > 1;
            for(int i = 2; prime && i < sqrt; ++i) {
                prime &= n % i != 0;
            }
            System.out.println(prime ? "Prime" : "Not prime");
        }
    }
}
