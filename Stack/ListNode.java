public class ListNode<E> implements Comparable<ListNode <E>> {
    E element;
    ListNode<E> next;

    public ListNode(E element, ListNode<E> next) {
        this.element = element;
        this.next = next;
    }

    public ListNode(E element) {
        this(element, null);
    }

    public ListNode() {
        this(null,null);
    }

    public int compareTo(ListNode<E> next) {
        return 0;
    }
 
}