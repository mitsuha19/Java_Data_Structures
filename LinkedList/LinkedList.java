public class LinkedList implements List {
    ListNode first;// linked list kosong jika first = null;

    // constructor
    public LinkedList() {
        first = null;
    }

    public LinkedList(ListNode e) {
        first = e;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void makeEmpty() {
        first = null;
    }

    public void insertFirst(ListNode e) {
        e.next = first;
        first = e;
    }

    public void insertLast(ListNode e) {
        if (isEmpty())
            insertFirst(e);
        else {
            ListNode p = first;
            while (p.next != null)
                p = p.next;
            p.next = e;
        }
    }

    public boolean deletetFirst() {
        if (isEmpty())
            return false;
        else {
            first = first.next;
            return true;
        }
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;
        else {
            // untuk menghapus elemen terakhir, perlu mengakses
            // elemen sebelum elemen terakhir
            ListNode last = first;
            // preLast untuk menyimpan elemen sebelum last
            ListNode preLast = null;
            while (last.next != null) {
                preLast = last;
                last = last.next;
            }
            // kondisi linked list hanya terdiri dari satu
            // elemen
            if (preLast == null)
                makeEmpty();
            else
                preLast.next = null;
            return true;

        }
    }

    public void print() {
        ListNode p = first;
        while (p != null) {
            System.out.println(p.element);
            p = p.next;
        }
    }

    public boolean contains(ListNode e) {
        ListNode p = first;
        if (e.element instanceof Point) {
            while (p != null) {
                if (p.element.equals(e.element)) {
                    return true;
                }
                p = p.next;
            }
            return false;
        } else {
            while (p != null) {
                if (p == e) {
                    return true;
                }
                p = p.next;
            }
            return false;
        }
       
    }
}
