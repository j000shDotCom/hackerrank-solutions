import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        while(s.hasNextLine()) {
            String ln = s.nextLine().trim();
            if (ln.length() == 0) {
                continue;
            }
            String[] parts = ln.split(" ");
            List<Integer> nums = new ArrayList<>(parts.length - 1);
            for(int i = 1; i < parts.length; ++i) {
                nums.add(Integer.parseInt(parts[i]));
            }
            System.out.println(parts[0] + " " + countParts(1, Collections.singletonList(nums)));
        }
        s.close();
    }

    private static int countParts(int pivot, List<List<Integer>> islands) {
        if (islands.size() == 0) {
            return 0;
        }
        boolean reduced = false;
        List<List<Integer>> parts = new ArrayList<>();
        for (List<Integer> nums : islands) {
            int begin = -1;
            for (int i = 0; i < nums.size(); ++i) {
                int curr = nums.get(i);
                if (begin < 0 && curr >= pivot) {
                    begin = i;
                } else if (begin >= 0 && curr < pivot) {
                    reduced = true;
                    parts.add(nums.subList(begin, i));
                    begin = -1;
                }
            }
            if (begin >= 0) {
                reduced |= begin != 0;
                parts.add(nums.subList(begin, nums.size()));
            }
        }
        return (reduced ? parts.size() : 0) + countParts(pivot + 1, parts);
    }
}

