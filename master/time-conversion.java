import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        String st;
        if(t.charAt(8) == 'A') {
           st = t.substring(0, 8);
        } else {
            int i = Integer.parseInt(t.substring(0,2)) + 12;
            st = i + t.substring(2);
        }
        System.out.println(st);
    }
}
