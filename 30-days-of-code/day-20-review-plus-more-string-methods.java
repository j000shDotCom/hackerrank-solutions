    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String[] sarr = in.nextLine().trim().split("[\\s'.,?!_@+\\[\\]\\\\]+");
            System.out.println(sarr.length);
            for(String s : sarr)
                System.out.println(s);
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}

