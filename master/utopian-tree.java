import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int height = 1;
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0)
                    height *= 2;
                else
                    height += 1;
            }
            System.out.println(height);
        }
    }
}
