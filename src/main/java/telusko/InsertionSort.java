package telusko;

public class InsertionSort {
    public static void main(String[] args) {


        int  [] nums = {6,5,2,8,9,4};
        insertionSort(nums);
    }

    public static void insertionSort(int [] arr){
        System.out.println("before sorted");
        for (int num: arr
             ) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            // move elements of arr [0..i-1], that are greater than key,
            // to one position ahead of their current position

            while (j >= 0 && arr[j] > key){
               arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("after sorted");
        for (int num: arr
        ) {
            System.out.print(num + " ");
        }
    }
}
