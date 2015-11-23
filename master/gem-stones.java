import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Set<Character> elems = new HashSet<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0 && in.hasNext()) {
            for(char c : in.next().toCharArray())
                elems.add(c);
        }
        for(int i = 1; i < n && elems.size() > 0; ++i) {
            Set<Character> intersection = new HashSet<>();
            for(char c : in.next().toCharArray())
                intersection.add(c);
            elems.retainAll(intersection);
        }
        System.out.println(elems.size());
    }
}
