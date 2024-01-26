package bst;

import java.util.Iterator;
import java.util.List;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    TreeNode<E> root;
    int size;

    public BST() {
    }

    public BST(E[] array) {

    }
    public List<TreeNode<E>> path(){
        return null;
    }

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root;
        if (current==null) return false;
        while(current!=null){
            if (current.element.compareTo(e)< 0){
                // can duyet nhanh ben tay phai node hien tai
                current = current.right;
            }else if (current.element.compareTo(e)>0){
                // can duyet nhanh ben tay trai
                current = current.left;
            }else {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        if (root ==null){
            // ko co ptu nao
            root = createNewNode(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current!=null){
                if (current.element.compareTo(e)< 0){
                    // can duyet nhanh ben tay phai node hien tai
                    parent=current;
                    current = current.right;
                }else if (current.element.compareTo(e)>0){
                    // can duyet nhanh ben tay trai
                    parent=current;
                    current = current.left;
                }else {
                    return false;
                }
            }
            // current  = null ;
            // parent = node leaf
            if (parent.element.compareTo(e)>0){
                parent.left = createNewNode(e);
            }else{
                parent.right = createNewNode(e);
            }
        }

        size++;
        return true;
    }

    @Override
    public boolean delete(E e) {
        if (!search(e)){
            return false;
        }
      root = delete_Recursive(root,e);
        size--;
      return true;
    }
   private TreeNode<E> delete_Recursive(TreeNode<E> root, E key)  { // trar ve node sau khi da xoa
        //tree is empty
        if (root == null)  return root;

        //traverse the tree
        if (key.compareTo(root.element)<0)     //traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key.compareTo(root.element)>0)  //traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else  {
            //  đây là node cần xóa
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            //get inorder successor (min value in the right subtree)
            // tim ra gia tri lon nhat cua nhanh trai
            root.element = maxValue(root.left); // gan rightmost cho gia tri cua node can xoa

            // Delete the inorder successor
            root.left = delete_Recursive(root.left, root.element); // thuc hien lai lenh xoas voi rightmost
        }
        return root;
    }
    private E maxValue(TreeNode<E> root)  {
        //initially minval = root
        E maxval = root.element;
        //find minval
        while (root.right != null)  {
            maxval = root.right.element;
            root = root.right;
        }
        return maxval;
    }

    @Override
    public void inorder() {

    }

    @Override
    public void preorder() {

    }

    @Override
    public void postorder() {

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
        this.root = null;
        this.size =0;
    }
    protected TreeNode<E> createNewNode(E element){
        return new TreeNode<>(element);
    }

}
