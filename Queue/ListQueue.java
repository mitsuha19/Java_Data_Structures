public class ListQueue<E> implements Queue<E> {
    private Listnode<E> front;
    private Listnode<E> back;
    private int queueSize;

    public ListQueue() {
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
        front = null;
        back = null;
    }

    public void Enqueue(E e) {
        Listnode<E> temp = new Listnode<>(e);
        if (isEmpty()) {
            front = temp;
        } else {
            back.next = temp;
        }
        back = temp;
        queueSize++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Array Queue is Empty");
        }
        E temp = front.element;
        front = front.next;
        queueSize--;
        return temp;
    }

    public E getFront() {
        if (isEmpty()) {
            throw new RuntimeException("Array Queue is Empty");
        }
        return front.element;
    }
}
