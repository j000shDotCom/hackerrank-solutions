import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNext()) {
            String st = in.next();
            char c = '#';
            int count = 0;
            for (int i = 0, len = st.length(); i < len; ++i) {
                char curr = st.charAt(i);
                if (c != curr)
                    c = curr;
                else
                    ++count;
            }
            System.out.println(count);
        }
    }
}
