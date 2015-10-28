import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        while(s.hasNextLine()) {
            String[] numStrs = s.nextLine().split(" ");
            if (numStrs.length < 20) {
                continue;
            }
            int[] nums = new int[numStrs.length - 1];
            for(int i = 1; i < numStrs.length; ++i) {
                nums[i - 1] = Integer.parseInt(numStrs[i]);
            }
            System.out.println(numStrs[0] + " " + bubbleSortStepCount(nums));
        }
    }
    
    private static int bubbleSortStepCount(int[] nums) {
        int steps = 0;
        boolean swap;
        do {
            swap = false;
            for (int i = 1; i < nums.length; ++i) {
                if(nums[i - 1] > nums[i]) {
                    ++steps;
                    int tmp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = tmp;
                    swap = true;
                }
            }
        } while (swap);
        return steps;
    }
}
