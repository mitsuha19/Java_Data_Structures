public class AVLTree {
    Node root;

    int height(Node N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Get balance factor of a node
    int GetBalanceFaktor(Node N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }

    // Insert a Node
    Node insertNode(Node node, int item) {

        // Find the position and insert the node
        if (node == null) {
            return (new Node(item));
        }
        if (item < node.item) {
            node.left = insertNode(node.left, item);
        } else if (item > node.item) {
            node.right = insertNode(node.right, item);
        } else {
            return node;
        }

        // Update the balance factor of each node
        // And, balance the tree
        node.height = 1 + max(height(node.left), height(node.right));
        int balanceFactor = GetBalanceFaktor(node);
        if (balanceFactor > 1) {
            if (item < node.left.item) {
                return rightRotate(node);
            } else if (item > node.left.item) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balanceFactor < -1) {
            if (item > node.right.item) {
                return leftRotate(node);
            } else if (item < node.right.item) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    Node nodeWithMinumValue(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Delete a node
    Node deleteNode(Node node, int item) {
        // Find the node to be deleted and remove it
        if (node == null) {
            return node;
        }
        if (item < node.item) {
            node.left = deleteNode(node.left, item);
        } else if (item > node.item) {
            node.right = deleteNode(node.right, item);
        } else {
            if ((node.left == null) || (node.right == null)) {
                Node temp = null;
                if (node.left == null) {
                    temp = node.right;
                } else {
                    temp = node.left;
                }
                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                Node temp = nodeWithMinumValue(node.right);
                node.item = temp.item;
                node.right = deleteNode(node.right, temp.item);
            }
        }
        if (node == null) {
            return node;
        }

        // update the balance factor of each bode and balance the tree
        node.height = max(height(node.left), height(node.right)) + 1;
        int balanceFactor = GetBalanceFaktor(node);
        if (balanceFactor > 1) {
            if (GetBalanceFaktor(node.left) >= 0) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balanceFactor < -1) {
            if (GetBalanceFaktor(node.right) <= 0) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Print the Tree
    private void printTree(Node currPtr, String indent, boolean last) {
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += " ";
            } else {
                System.out.print("L----");
                indent += "| ";
            }
            System.out.println(currPtr.item);
            printTree(currPtr.left, indent, false);
            printTree(currPtr.right, indent, true);
        }
    }

    public void printAVLTreeT() {
        printTree(root, "", true);
    }

}
