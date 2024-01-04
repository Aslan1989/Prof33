package lesson11Queue;

import java.util.*;

public class DequeTest {

    // функция которая принимает на вход массив целых и число
    // должна возвратить true если это число является произведением любых двух  чисел и массивов
    // пример [2,7,5,12,14], 60 - true потому что 5 * 12 = 60


        public static boolean isProduct(List<Integer> numbers, int target) {
            Collections.sort(numbers);
            Deque<Integer> deque = new ArrayDeque<>();
            deque.addAll(numbers);
            int first = deque.removeFirst();
            int last = deque.removeLast();

            while (!deque.isEmpty())
            {
                int multy = first*last;
                if (multy > target)
                    last = deque.removeLast();
                else if (multy < target) {
                    first = deque.removeFirst();
                }
                else
                    return true;
            }
            return false;

//            Set<Integer> seen = new HashSet<>();
//            Deque<Integer> deque = new ArrayDeque<>();
//
//            for (int num : numbers) {
//                if (target % num == 0) {
//                    int complement = target / num;
//
//                    if (seen.contains(complement)) {
//                        return true; // Found a pair whose product is equal to the target
//                    }
//
//                    deque.offer(num);
//                    seen.add(num);
//
//                    if (deque.size() > 1) {
//                        seen.remove(deque.poll());
//                    }
//                }
//            }
//
//            return false; // No pair found
        }

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>(List.of(2,7,5,12,14));
            int target = 60;

//            boolean result = isProduct(numbers, target);
            boolean result = isProduct(numbers,target);
            System.out.println(
                    isProduct(
                            new ArrayList<>(List.of(2,7,5,12,14)), 100
                    )
            );

            if (result) {
                System.out.println(target + " is the product of two numbers in the array.");
            } else {
                System.out.println(target + " is not the product of any two numbers in the array.");
            }
        }
    }




