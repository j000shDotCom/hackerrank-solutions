import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        StringBuilder sb = new StringBuilder();
        while (in.hasNextLine()) {
            sb.append(in.nextLine());
            sb.append(' ');
        }
        String str = sb.toString().trim();
        Pattern pattern = Pattern.compile("<a href=\"([^\"]*)\"[^>]*>(<[^>]*?>)*([^<]*)");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            System.out.println(m.group(1) + "," + m.group(3).trim());
        }
    }
}
