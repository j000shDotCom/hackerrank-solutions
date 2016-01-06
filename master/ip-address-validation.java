import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        while(in.hasNextLine()) {
            String next = in.nextLine().trim();
            String[] ipv4 = next.split("\\.");
            String[] ipv6 = next.split(":");
            boolean valid = true;
            if (ipv4.length == 4) {
                for (String s : ipv4)
                    valid &= 256 > Integer.valueOf(s, 10);
                System.out.println(valid ? "IPv4" : "Neither");
            } else if (ipv6.length == 8) {
                for (String s : ipv6)
                    valid &= Pattern.matches("[\\dabcdef]{1,4}", s);
                System.out.println(valid ? "IPv6" : "Neither");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
