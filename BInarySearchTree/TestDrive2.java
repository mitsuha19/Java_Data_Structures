public class TestDrive2 {
    @SuppressWarnings({ "unused", "unchecked", "rawtypes" })
    public static void main(String[] args) {
        BinaryNode node = new BinaryNode(5);
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(19);
        tree.insert(10);
        tree.insert(13);
        tree.insert(22);
        tree.insert(2);

        System.out.println("Tree dicetak secara Inorder");
        printInorder(tree.root);
        System.out.println();
        System.out.println();

        // Mencari nilai terkecil dan terbesar
        System.out.println("Nilai terkecil: " + tree.findMin());
        System.out.println("Nilai terbesar: " + tree.findMax());
        System.out.println();

        // Mencari elemen dalam pohon
        int searchValue = 19;
        System.out.println("Mencari nilai " + searchValue + ": " + tree.find(searchValue));
        System.out.println();

        // Menghapus elemen minimum
        tree.removeMin();
        System.out.println("Setelah menghapus nilai terkecil:");
        printInorder(tree.root);
        System.out.println();

        // Menghapus sebuah elemen
        tree.remove(13);
        System.out.println("Setelah menghapus elemen 13");
        printInorder(tree.root);
        System.out.println();
        System.out.println();

        // membuat tree menjadi kosong dan pengecekannya
        tree.makeEmpty();
        System.out.println(tree.isEmpty());

    }

    @SuppressWarnings("rawtypes")
    private static void printInorder(BinaryNode t) {
        if (t != null) {
            printInorder(t.left);
            System.out.print(t.element + " ");
            printInorder(t.right);
        }

    }

}
