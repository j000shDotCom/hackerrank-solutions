import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        long sum = 0;
        while(s.hasNextLong()) {
            sum += s.nextLong();
        }
        System.out.println(sum);
        s.close();
    }
}
