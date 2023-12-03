package telusko;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int [] nums = {9,6,5,3,8,3,6,1};
        int size = nums.length-1;
        int temp =0;
        int minIndex = -1;

        System.out.println("before sorting");
        for (int num: nums
             ) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            minIndex =i;
            for (int j = i + 1; j < size+1; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num: nums
            ) {
                System.out.print(num + " ");
            }

        }

        System.out.println();
        System.out.println("after sorting");
        for (int num: nums
        ) {
            System.out.print(num + " ");
        }
    }
}
