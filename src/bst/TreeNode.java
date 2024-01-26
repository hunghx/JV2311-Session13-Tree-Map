package bst;

public class TreeNode <E>{
    E element;
    TreeNode<E> left,right;
    public TreeNode(E element){
        this.element = element;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "element=" + element +
                '}';
    }
}
