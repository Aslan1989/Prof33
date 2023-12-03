package telusko;

public class MergeSort {
    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;

        }

        while (i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 6, 2};

        for (int n : arr
        ) {
            System.out.print(n + " ");
        }
        System.out.println();


        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting");
        for (int n : arr
        ) {
            System.out.print(n + " ");
        }
    }


}
