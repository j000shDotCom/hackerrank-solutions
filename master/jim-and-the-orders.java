import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        Map<Integer, Set<Integer>> map = new TreeMap<>();
        int count = 1;
        while (in.hasNextInt()) {
            int n = in.nextInt() + in.nextInt();
            Set<Integer> set;
            if (!map.containsKey(n)) {
                set = new TreeSet<>();
                map.put(n, set);
            } else {
                set = map.get(n);
            }
            set.add(count++);
        }
        for (Set<Integer> i : map.values())
            for (int j : i)
            System.out.print(j + " ");
    }
}
