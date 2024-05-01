class ListNode implements Comparable<ListNode> {
    Object element; // data dari elemen, elemen bisa bertipe
                    // reference ataupun bertipe primitif
    ListNode next;

    // constructor
    public ListNode(Object theElement, ListNode n) {
        element = theElement;
        next = n;
    }

    public ListNode(Object theElement) {
        this(theElement, null);
    }

    public ListNode() {
        this(null, null);
    }

    // Asumsi elemen ListNode adalah turunan dari kelas Number
    public int compareTo(ListNode e) {
        if (element.equals(e.element) )
            return 0;
        else
            return 1;
    }

}