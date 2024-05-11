public interface Queue<E> {
    int size();
    boolean isEmpty();
    void clear();
    void Enqueue(E e);
    E dequeue();
    E getFront();
}