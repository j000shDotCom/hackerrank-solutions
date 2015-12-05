import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        in.nextLine();
        String[] nums = in.nextLine().trim().split(" ");
        for(int i = 0; i < nums.length; ++i) {
            int j = Integer.parseInt(nums[i]);
            if (n == j) {
                System.out.println(i);
                break;
            }
        }
    }
}
