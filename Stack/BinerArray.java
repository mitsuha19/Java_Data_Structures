import java.util.EmptyStackException;

public class BinerArray {
    private int array[];
    private int top;

    public BinerArray(int n) {
        array = new int[n];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        top = -1;
    }

    public void push(int e) {
        if (top == array.length - 1) {
            System.out.println("Array is Full");
        } else {
            array[++top] = e;
        }
    }

    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return array[top];
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            top--;
        }
    }

    public int topAndPop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int out = array[top];
            top--;
            return out;
        }
    }

    public void getBinary() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
