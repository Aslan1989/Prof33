package telusko.stackUse;

public class Stack {
    int[] stack = new int[5];
    int top = 0;
    public void push(int i) {
        stack[top] = i;
        top++;
    }

    public void show() {

        for (int n: stack
             ) {
            System.out.print(n + " ");
        }
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        int data;
        data = stack[top-1];
        return data;
    }
}
