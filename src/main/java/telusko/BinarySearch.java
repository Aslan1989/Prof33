package telusko;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {3, 5, 7, 9, 11};
        int target = 9;
        int result = binarySearch(nums, target);

        if (result != -1)
            System.out.println("Element found at : " + result);
        else
            System.out.println("Element not found(((");

        int[] nums1 = {3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target1 = 19;

        int result1 = linearSearch(nums1, target1);

        if (result != -1)
            System.out.println("Element found by linear search at : " + result1);
        else
            System.out.println("Element not found(((");
    }

    private static int linearSearch(int[] nums1, int target1) {

        int steps = 0;
        for (int i = 0; i < nums1.length; i++) {
            steps++;
            if (target1 == nums1[i]){
                System.out.println("Steps taken in linear search " + steps);
                return i;
            }

        }
        System.out.println("Steps taken in linear search " + steps);
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {

        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                System.out.println("Steps taken in binary search " + steps);
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        System.out.println("Steps taken in binary search " + steps);
        return -1;
    }

}
