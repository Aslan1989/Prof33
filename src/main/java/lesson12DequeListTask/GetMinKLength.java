package lesson12DequeListTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class GetMinKLength {
    public static void main(String[] args) {

        System.out.println(getMinKLength(new int[]{1,3,5,7,9}, 8));
        System.out.println(getMinKLength(new int[]{1,3,5,7,9}, 14));
    }
    // есть массив из целых чисел Nums и есть число k
    // написать функцию, которая вернет минимальную длину подмассива из nums
    // сумма элементов которого больше k
    // nums = [1, 3, 5, 7, 9], k = 8 -> 1 [9] > k
    // nums = [1, 3, 5, 7, 9], k = 14 -> 1 [9] > k
    public static int getMinKLength(int [] nums, int k) {
        int currentMinK = 0; // текущая длина самого короткого подмассива суммой больше k
        // TODO
        Deque<Integer> d = new ArrayDeque<>(); // "скользящее окно"
        int sum = 0; // текущая сумма всех элементов подмассива

        for (int n : nums
        ) {
            // текущай элемент массива
                d.addFirst(n);
                sum += n;
                if (sum < k)
                    continue;
                if (sum > k) {
                    if (currentMinK == 0)
                        currentMinK = d.size();
                    while (-d.getLast() + sum > k)
                        sum -= d.removeLast();
                    if (currentMinK > d.size())
                        currentMinK = d.size();
                }

        }
        return currentMinK;
    }
}
