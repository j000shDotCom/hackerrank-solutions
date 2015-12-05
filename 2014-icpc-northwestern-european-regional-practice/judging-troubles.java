import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Long> counts = new HashMap<>();
        long score = 0;
        while(n-- > 0)
            incMap(counts, in.next());
        while(in.hasNext()) {
            if(remMap(counts, in.next()))
                score += 1;
        }
        System.out.println(score);
    }
    
    private static void incMap(Map<String,Long> counts, String s) {
        if (!counts.containsKey(s))
            counts.put(s, 1L);
        else
            counts.put(s, counts.get(s) + 1L);
    }
    
    private static boolean remMap(Map<String,Long> counts, String s) {
        if (!counts.containsKey(s))
            return false;
        Long l = counts.get(s);
        if (l <= 0L) {
            return false;
        }
        counts.put(s, l - 1L);
        return true;
    }
}
