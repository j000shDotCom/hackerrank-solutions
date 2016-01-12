import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int diff = in.nextInt();
        int count = 0;
        Set<Integer> set = new HashSet<>();
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (set.contains(n - diff))
                count += 1;
            if (set.contains(n + diff))
                count += 1;
            set.add(n);
        }
        System.out.println(count);
    }
}
