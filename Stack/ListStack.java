public class ListStack<E> implements Stack<E>  {
    private ListNode<E> top;
    private int stackSize;

    public ListStack() {
        clear();
    }
    
    public int size() {
        return stackSize;
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public void clear() {
        stackSize = 0;
        top = null;
    }

    public void push(E e) {
        ListNode<E> newNode = new ListNode<>(e, top);
        top = newNode;
        stackSize++;
    }

    public E top() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return top.element;
    }

    public void pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        top = top.next;
        stackSize--;
    }

    public E topAndPop() {
        E out = top();
        pop();
        return out;
    }

}
