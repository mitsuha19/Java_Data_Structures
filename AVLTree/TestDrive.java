public class TestDrive {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insertNode(tree.root, 10);
        tree.root = tree.insertNode(tree.root, 85);
        tree.root = tree.insertNode(tree.root, 15);
        tree.root = tree.insertNode(tree.root, 70);
        tree.root = tree.insertNode(tree.root, 20);
        tree.root = tree.insertNode(tree.root, 60);
        tree.root = tree.insertNode(tree.root, 30);
        tree.root = tree.insertNode(tree.root, 50);
        tree.root = tree.insertNode(tree.root, 65);
        tree.root = tree.insertNode(tree.root, 80);
        tree.root = tree.insertNode(tree.root, 90);
        tree.root = tree.insertNode(tree.root, 40);
        tree.root = tree.insertNode(tree.root, 5);
        tree.root = tree.insertNode(tree.root, 55);

        System.out.println("Tree secara PreOrder : ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println();

        System.out.println("Tree dengan struktur yang lebih jelas : ");
        tree.printAVLTreeT();
        System.out.println();
        
        System.out.print("Tinggi tree : ");
        System.out.println(tree.height(tree.root));
        System.out.println();

        System.out.print("Nilai terkecil pada Tree : ");
        tree.preOrder(tree.nodeWithMinumValue(tree.root));
        System.out.println();
        System.out.println();

        tree.root = tree.deleteNode(tree.root, 60);
        System.out.println("Tree setelah node 60 dihapus : ");
        tree.printAVLTreeT();

    }
}
