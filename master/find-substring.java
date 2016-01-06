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
        
        sb = new StringBuilder();
        n = in.nextInt();
        in.nextLine();
        
        while (n-- > 0)
            sb.append(in.nextLine()).append('\n');
        
        String subStr = sb.toString().trim();
        
        int count = 0;
        Pattern pattern = Pattern.compile("[\\S]" + subStr + "[\\S]");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            count += 1;
        }
        
        System.out.println(count);
    }
}
