import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String[] s = in.nextLine().trim().split(" ");
        int[] rings = new int[s.length];
        for(int i = 0; i < rings.length; ++i)
            rings[i] = Integer.parseInt(s[i]);
        
        Map<Double, Integer> distanceCounts = new TreeMap<>();
        while(in.hasNextInt()) {
            double hyp = getHypotenuse(in.nextInt(), in.nextInt());
            incMap(distanceCounts, hyp);
        }
        System.out.println(calculateScore(rings, distanceCounts));
    }
    
    private static void incMap(Map<Double, Integer> map, double d) {
        if (!map.containsKey(d)) {
            map.put(d, 1);
        } else {
            int count = map.get(d);
            map.put(d, count + 1);
        }
    }
    
    private static long calculateScore(final int[] rings, Map<Double, Integer> distanceCounts) {
        long sum = 0;
        int i = rings.length - 1;
        for (double d : distanceCounts.keySet()) {
            boolean scored = false;
            while (!scored) {
                if (i < 0 || (i == 0 && d == rings[i])) {
                    return sum;
                }
                if (d <= rings[i]) {
                    sum += distanceCounts.get(d) * (i + 1);
                    scored = true;
                } else {
                    --i;
                }
            }
        }
        return sum;
    }
    
    private static double getHypotenuse(int a, int b) {
        return Math.sqrt((long)a*a + (long)b*b);
    }
}
