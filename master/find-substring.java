import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0)
            sb.append(in.nextLine()).append('\n');
        
        String str = sb.toString().trim();
        
        n = in.nextInt();
        in.nextLine();
        
        List<String> subs = new ArrayList<>(n);
        while (n-- > 0)
            subs.add(in.nextLine().trim());
        
        int count = 0;
        for (String subStr : subs) {
            Pattern pattern = Pattern.compile("\\w" + subStr + "\\w");
            Matcher m = pattern.matcher(str);
            while (m.find()) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
