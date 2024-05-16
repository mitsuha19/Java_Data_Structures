public class BinaryNode<AnyType> {

    BinaryNode(AnyType TheElement) {
        element = TheElement;
        left = right = null;
    }
    
    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;
}