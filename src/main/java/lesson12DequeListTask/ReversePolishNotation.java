package lesson12DequeListTask;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReversePolishNotation {
    public static void main(String[] args) {

        System.out.println(reversePolishNotation("2 2 * 1 - 4 * 12 +"));
    }

    // обратно польский калькулятор
    // reverse-polish notation
    // 22*1-4*12+
    //22*
    //4 1 -
    //3 4 *
    // 12 12 +
    // 24
    public static int  reversePolishNotation(String w)
    {
        Queue<String> op = new LinkedList<>(
                Arrays.asList(
                        w.split(" ")
                )
        );
        int op1 = 0;
        // op.poll() возвращает след элемент и удаляет его из очереди
        if (op.size() > 0){
             op1 = Integer.parseInt(op.poll());
            while (op.size() >=2)
            {
                int res =0;
                int op2 = Integer.parseInt(op.poll());

                String oper = op.poll();
                switch (oper)
                {
                    case "+" -> res = op1+op2;
                    case "-" -> res = op1-op2;
                    case "*" -> res = op1*op2;
                    case "/" -> res = op1/op2;
                }
                System.out.printf("%d %s %d = %d \n", op1,oper, op2, res);
                op1 = res;
            }
        }
        return op1;
    }
}
