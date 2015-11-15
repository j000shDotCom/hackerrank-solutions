import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        BitSet bs = new BitSet(26);
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                bs.set(c - 'a');
            }
        }
        System.out.println(bs.cardinality() == 26 ? "pangram" : "not pangram");
    }
}
