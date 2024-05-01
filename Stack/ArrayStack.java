import java.util.EmptyStackException;

public class ArrayStack<E> implements  Stack<E> {
    private E[] array;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
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

    @Override
    public void push(E e) {
        if (top == array.length -1) {
            System.out.println("Array is Full");
        } else {
            array[++top] = e;
        }
    }

    public E top() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            return array[top];
        }
    }
    
    public void pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            top--;
        }
    }

    public E topAndPop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            E out = array[top];
            top--;
            return out;
        }
    }


}
