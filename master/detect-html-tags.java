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
        Pattern pattern = Pattern.compile("</([^>]+)>");
        Matcher m = pattern.matcher(str);
        Set<String> tags = new TreeSet<>();
        while (m.find()) {
            tags.add(m.group(1));
        }
        if (Pattern.matches("\\[[^\\]]*\\]\\([^\\)]*\\)", str)) {
            tags.add("a");
        }
        sb = new StringBuilder();
        for (String s : tags)
            sb.append(s).append(";");
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}
