package leetcodeTasks;

import java.util.Arrays;

public class Task1TwoSum {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};

        System.out.println(
                Arrays.toString(
                     twoSum(a,3)
                )
        );

    }

    public static int [] twoSum(int [] nums, int target)
    {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{}; // No solution found
    }

}
