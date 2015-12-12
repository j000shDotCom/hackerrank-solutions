import java.io.*;
import java.util.*;

public class Solution {

    public enum Op {
        M('*'), A('+');
        public char c;
        Op(char c) {this.c = c;}
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int A = in.nextInt();
        final int B = in.nextInt();
        final int C = in.nextInt();
        for(Op i : Op.values()) {
            int x = doOp(i, B, C);
            for(Op j : Op.values()) {
                if (doOp(j, A, x) == 42) {
                    System.out.printf("%d%s%d%s%d", A, j.c, B, i.c, C);
                    return;
                }
            }
        }
        System.out.print("This is not the ultimate question");
    }
    private static int doOp(Op op, int x, int y) {
        switch(op) {
            case M: return x * y;
            case A: return x + y;
        }
        return -1;
    }
}
