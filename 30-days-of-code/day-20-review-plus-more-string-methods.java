    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sarr = in.nextLine().split("[\\s'.,?!_@+\\[\\]\\\\]+");
        System.out.println(sarr.length);
        for(String s : sarr)
            System.out.println(s);
    }
}

