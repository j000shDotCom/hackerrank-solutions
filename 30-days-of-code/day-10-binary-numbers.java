import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextInt())
            System.out.println(Integer.toString(in.nextInt(), 2));
    }
}

