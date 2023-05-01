public class RBNode {
    int data;
  
    RBNode left;
    RBNode right;
    RBNode parent;
    RBNode root;
  
    boolean color;

    private void replaceParentsChild(RBNode parent, RBNode oldChild, RBNode newChild) {
        if (parent == null) {
          root = newChild;
        } else if (parent.left == oldChild) {
          parent.left = newChild;
        } else if (parent.right == oldChild) {
          parent.right = newChild;
        } 
      
        if (newChild != null) {
          newChild.parent = parent;
        }
    }

    // правый поворот
    private void rotateRight(RBNode node) { // 
        RBNode parent = node.parent;
        RBNode leftChild = node.left;
      
        node.left = leftChild.right;
        if (leftChild.right != null) {
          leftChild.right.parent = node;
        }
      
        leftChild.right = node;
        node.parent = leftChild;
      
        replaceParentsChild(parent, node, leftChild);
    }

    // левый поворот
    private void rotateLeft(RBNode node) {
        RBNode parent = node.parent;
        RBNode rightChild = node.right;
      
        node.right = rightChild.left;
        if (rightChild.left != null) {
          rightChild.left.parent = node;
        }
      
        rightChild.left = node;
        node.parent = rightChild;
      
        replaceParentsChild(parent, node, rightChild);
    }
}