import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        int hh = Integer.parseInt(t.substring(0,2)) % 12;
        if(t.charAt(8) == 'P') {
           hh += 12;
        }
        System.out.println(hh + t.substring(2, 8));
    }
}
