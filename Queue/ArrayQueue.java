import javax.management.RuntimeErrorException;

public class ArrayQueue<E> implements Queue<E> {
    private E[] array;
    private int queueSize;
    private int front;
    private int back;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayQueue() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
        clear();
    }

    public int size() {
        return queueSize;
    }

    public boolean isEmpty() {
        return queueSize == 0;
    }

    public void clear() {
        queueSize = 0;
        front = -1;
        back = -1;
    }

    private int increment(int x) {
        if (++x == array.length) {
            x = 0;
        }
        return x;
    }

    public void Enqueue(E e) {
        if (size() == array.length) {
            throw new RuntimeException("Array Queue is Full");
        }
        if (front == -1) {
            front = 0;
            back = (back + 1) % DEFAULT_CAPACITY;
            array[back] = e;
            queueSize++;
        }
    }

    public  E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Array Queue is Empty");
        }
        E temp = array[front];
        if (front == back) {
            front = -1;
            back = -1;
        } else {
            front = (front + 1) % DEFAULT_CAPACITY;
        }

        queueSize--;
        return temp;
    }

    public E getFront() {
        if (isEmpty()) {
            throw new RuntimeException("Array Queue is Empty");
        }
        return array[front];
    }
}
