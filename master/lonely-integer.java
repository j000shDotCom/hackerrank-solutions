import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        Set<Integer> intSet = new HashSet<>();
        while(in.hasNextInt()) {
            int n = in.nextInt();
            if (!intSet.add(n)) {
                intSet.remove(n);
            }
        }
        System.out.println(intSet.iterator().next());
    }
}
