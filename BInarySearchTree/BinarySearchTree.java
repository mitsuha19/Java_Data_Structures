import java.util.DuplicateFormatFlagsException;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    protected BinaryNode<AnyType> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(AnyType x) {
        root = insert(x, root);
    }

    public void remove(AnyType x) {
        root = remove(x, root);
    }

    public void removeMin() {
        root = removeMin(root);
    }

    public AnyType findMin() {
        return elementAt(findMin(root));
    }

    public AnyType findMax() {
        return elementAt(findMax(root));
    }

    public AnyType find(AnyType x) {
        return elementAt(find(x, root));
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private AnyType elementAt(BinaryNode<AnyType> t) {
        return t == null ? null : t.element;
    }

    private BinaryNode<AnyType> find(AnyType x, BinaryNode<AnyType> t) {
        while (t != null) {
            if (x.compareTo(t.element) < 0) {
                t = t.left;
            } else if (x.compareTo(t.element) > 0) {
                t = t.right;
            } else {
                return t;
            }
        }
        return null;
    }

    protected BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
        if (t != null)
            while (t.left != null)
                t = t.left;

        return t;
    }

    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
        if (t != null)
            while (t.right != null)
                t = t.right;

        return t;
    }

    protected BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {
        if (t == null)
            t = new BinaryNode<AnyType>(x);
        else if (x.compareTo(t.element) < 0)
            t.left = insert(x, t.left);
        else if (x.compareTo(t.element) > 0)
            t.right = insert(x, t.right);
        else
            throw new DuplicateFormatFlagsException(x.toString()); // Duplicate
        return t;
    }

    protected BinaryNode<AnyType> removeMin(BinaryNode<AnyType> t) {
        if (t == null)
            throw new ItemNotFoundException();
        else if (t.left != null) {
            t.left = removeMin(t.left);
            return t;
        } else
            return t.right;
    }

    protected BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {
        if (t == null)
            throw new ItemNotFoundException(x.toString());
        if (x.compareTo(t.element) < 0)
            t.left = remove(x, t.left);
        else if (x.compareTo(t.element) > 0)
            t.right = remove(x, t.right);
        else if (t.left != null && t.right != null) // Two children
        {
            t.element = findMin(t.right).element;
            t.right = removeMin(t.right);
        } else
            t = (t.left != null) ? t.left : t.right;
        return t;
    }

}
