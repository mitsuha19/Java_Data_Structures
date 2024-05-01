public interface Stack<E> {
    int size();
    boolean isEmpty();
    void clear();
    void push(E e);
    E top();
    void pop();
    E topAndPop();
}
