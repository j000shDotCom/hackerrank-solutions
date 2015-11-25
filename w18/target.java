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
        
        long sum = 0;
        while(in.hasNextInt()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int score = getScore(rings, x, y);
            //System.out.printf("%d %d %.3f %d\n", x, y, getHypotenuse(x,y), score);
            sum += score;
        }
        System.out.println(sum);
    }
    
    private static int getScore(final int[] rings, int x, int y) {
        double c = getHypotenuse(x, y);
        for(int i = 0; i < rings.length; ++i) {
            if(c >= rings[i])
                return i;
        }
        return rings.length;
    }
    
    private static double getHypotenuse(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }
}
