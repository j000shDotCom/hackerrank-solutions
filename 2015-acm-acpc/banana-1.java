import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        Map<String, String> dictionary = new HashMap<>();
        while (d-- > 0) {
            String a = in.next();
            in.next();
            dictionary.put(a, in.next());
        }
        d = in.nextInt();
        while (d-- > 0) {
            int w = in.nextInt();
            while (w-- > 0) {
                System.out.print(dictionary.get(in.next()) + " ");
            }
            System.out.println();
        }
    }
}
