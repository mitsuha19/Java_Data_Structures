public class TestLinkkedList2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(20, null);
        ListNode node2 = new ListNode(21, null);
        LinkedList linked = new LinkedList(node1);
        linked.insertFirst(node2);
        linked.insertLast(new ListNode(22, null));
        linked.insertLast(new ListNode(23, null));
        linked.insertFirst(new ListNode(23, null));
        linked.insertFirst(new ListNode(new Point(10, 20), null));
        // menampilkan semua elemen linked list mulai dari
        // awal sampai akhir.
        linked.print();
        if (linked.contains(new ListNode(new Point(10,20), null)) == true)
            System.out.println("ketemu");
        if (linked.contains(new ListNode(new Point(100, 200), null)) == true)
            System.out.println("ketemu");
        if (linked.contains(node1) == true)
            System.out.println("ketemu");
    }
}
