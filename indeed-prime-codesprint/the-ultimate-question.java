import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int A = in.nextInt();
        final int B = in.nextInt();
        final int C = in.nextInt();
        
        if(A+B+C == 42)
            System.out.printf("%d+%d+%d", A, B, C);
        else if (A+B*C==42)
            System.out.printf("%d+%d*%d", A, B, C);
        else if (A*B+C==42)
            System.out.printf("%d*%d+%d", A, B, C);
        else if (A*B*C==42)
            System.out.printf("%d*%d*%d", A, B, C);
        else
            System.out.print("This is not the ultimate question");
    }
}
