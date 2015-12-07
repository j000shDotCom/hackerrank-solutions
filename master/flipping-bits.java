import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        while(in.hasNext())
            System.out.println(Integer.toUnsignedString(0xFFFFFFFF ^ Integer.parseUnsignedInt(in.next())));
    }
}
