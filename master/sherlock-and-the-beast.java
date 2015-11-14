import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt()) {
            int digits = in.nextInt();
            if (digits <= 2 || digits == 4 || digits == 7)
                System.out.println("-1");
            else {
                String s = doCalc(digits);
                System.out.println(s);
            }
        }
    }
    
    private static String doCalc(int digits) {
        char[] chars = new char[digits];
        int n5 = digits / 3;
        int mod = digits % 3;
        if (mod == 0) {
            Arrays.fill(chars, 0, n5 * 3, '5');
            return new String(chars);
        }
        if (mod == 1) {
            n5 -= 3;
        } else {
            n5 -= 1;
        }
        Arrays.fill(chars, 0, n5 * 3, '5');
        Arrays.fill(chars, n5 * 3, chars.length, '3');
        return new String(chars);
    }
}

