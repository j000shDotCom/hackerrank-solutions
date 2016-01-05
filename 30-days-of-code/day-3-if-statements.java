import java.util.Scanner;
    
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean weird = n % 2 == 1 || (n >= 6 && n <= 20);
        System.out.println(weird ? "Weird" : "Not Weird");
    }
}

