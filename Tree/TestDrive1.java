public class TestDrive1 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        // Method pada class BinaryNode
        BinaryNode node = new BinaryNode(2, null, null);
        BinaryNode node2 = new BinaryNode(3,null,null);
        BinaryNode node3 = new BinaryNode(1,node,node2);
        BinaryNode node4 = new BinaryNode(5,node3,node);

       // mengubah mengambil root dari node4
        node4.setElement("rohit");
        System.out.println(node4.getElement());
        System.out.println();

        //mengubah dan mengambil subtree bagian kiri dari node4
        BinaryNode test = new BinaryNode("panjaitan", node2, node);
        node4.setLeft(test);
        BinaryNode kiri = node4.getLeft();
        kiri.printPreOrder();
        System.out.println();

        // mengambil subtree bagian kanan dari node 4
        BinaryNode kanan = node4.getRight();
        kanan.printPreOrder();
        System.out.println();

        
        BinaryNode duplicate = node4.duplicate();
        System.out.println("dicetak secara preorder:");
        duplicate.printPreOrder();
        System.out.println();
        System.out.println("dicetak secara inorder");
        duplicate.printInOrder();
        System.out.println();
        System.out.println("dicetak secara postorder");
        duplicate.printPostOrder();
        System.out.println();


        // Method pada BinaryTre
        BinaryTree tree = new BinaryTree(5);
        System.out.println("Sebelum di Merge : ");
        System.out.println("Size Pohon :" + tree.size());
        System.out.println("Tinggi Pohon :" + tree.height());
        System.out.println();

        BinaryTree tree2 = new BinaryTree(0);
        tree.merge(5, tree, tree2);
   
        System.out.println("Setelah di Merge : ");
        System.out.println("Size Pohon :" + tree.size());
        System.out.println("Tinggi Pohon :" + tree.height());
        System.out.println();

        tree.makeEmpty();
        System.out.println(tree.isEmpty());
        node = tree.getRoot();
        node.printPreOrder();  
    }
}
