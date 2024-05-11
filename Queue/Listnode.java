public class Listnode<E> implements Comparable<Listnode> {
    E element;
    Listnode<E> next;

    public Listnode (E element, Listnode<E> next) {
        this.element = element;
        this.next = next;
    }

    public Listnode(E element) {
        this(element, null);
    }

    public Listnode() {
        this(null,null);
    }

    @Override
    public int compareTo(Listnode a) {
        if (element.equals(a.element)) {
            return 0;
        } else {
            return 1;
        }
    }
    
}