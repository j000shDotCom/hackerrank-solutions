import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        int count = 1;
        while (in.hasNextInt()) {
            map.put(in.nextInt() + in.nextInt(), count++);
        }
        for (int i : map.values())
            System.out.print(i + " ");
    }
}
