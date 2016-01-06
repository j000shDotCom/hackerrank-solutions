import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        StringBuilder sb = new StringBuilder();
        while (in.hasNextLine()) {
            sb.append(in.nextLine()).append(' ');
        }
        
        Set<String> tags = new TreeSet<>();
        String str = sb.toString();
        Pattern pattern = Pattern.compile("</?\\s*(\\w+)");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            tags.add(m.group(1));
        }
        pattern = Pattern.compile("\\[[^\\]]*\\]\\([^\\)]*\\)");
        m = pattern.matcher(str);
        if (m.find()) {
            tags.add("a");
        }
        
        sb = new StringBuilder();
        for (String s : tags)
            sb.append(s).append(";");
        if(sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
