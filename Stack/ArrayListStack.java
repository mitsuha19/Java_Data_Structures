import java.util.ArrayList;

public class ArrayListStack<E> implements Stack<E>{
    private ArrayList<E> items;

    public ArrayListStack() {
        items = new ArrayList<E>();
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }

    public void push(E e) {
        items.add(e);
    }

    public E top() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return items.get(size()-1);
    }

    public void pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        items.remove(size() - 1);
    }
    
    public E topAndPop() {
        E out = top();
        pop();
        return out;
    }
}
