import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        while(in.hasNextLine()) {
            boolean valid = Pattern.matches("[\\._]\\d+[a-zA-Z]*_?", in.nextLine().trim());
            System.out.println(valid ? "VALID" : "INVALID");
        }
    }
}
