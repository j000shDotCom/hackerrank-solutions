import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int t = in.nextInt();
        Map<Integer, List<Integer>> tree = new HashMap<>();
        while(in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            List<Integer> lst;
            if (!tree.containsKey(a)) {
                lst = new ArrayList<>();
                tree.put(a, lst);
            } else
                lst = tree.get(a);
            lst.add(b);
        }
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : tree.entrySet()) {
            int n = entry.getKey();
            List<Integer> lst = entry.getValue();
            count += dfsRec(n, t, tree, new HashSet<>(), lst);
        }
        System.out.println(count);
    }
    
    private static int dfsRec(int n, int t, Map<Integer, List<Integer>> tree, Set<Integer> vis,
                              List<Integer> lst) {
        if (lst == null || lst.isEmpty())
            return 0;
        int count = 0;
        for (int e : lst) {
            if (!vis.add(e))
                continue;
            if (Math.abs(n - e) <= t)
                count += 1;
            count += dfsRec(n, t, tree, vis, tree.get(e));
        }
        return count;
    }
}
