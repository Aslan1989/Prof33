package telusko;

import java.util.Arrays;
import java.util.Objects;

public class BubbleSort1 {
    public static void main(String[] args) {
        int [] nums = {6,5,3,7,1,9,8};
//        int size = nums.length-1;
//        int  temp = 0;
//        System.out.println("before sorting");
//        for (int num: nums
//             ) {
//            System.out.print(num + " ");
//        }
//
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size -i; j++) {
//                if (nums[j] > nums[j+1]){
//                    temp = nums[j];
//                    nums[j] = nums[j +1];
//                    nums[j+1] = temp;
//                    System.out.println();
//                    for (int num: nums
//                    ) {
//                        System.out.print(num + " ");
//                    }
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("after sorting");
//        for (int num: nums
//             ) {
//            System.out.print(num + " ");
//        }

        bubbleSort(nums);

    } // main

    public static void bubbleSort(int[] nums) {
        int size = nums.length - 1;
        int temp = 0;

        System.out.println("before sorting");
        for (int num : nums
        ) {
            System.out.print(num + " ");
        }


       for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    System.out.println();
                    for (int num : nums
                    ) {
                        System.out.print(num + " ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for (int num : nums
        ) {
            System.out.print(num + " ");
        }
    }
}
