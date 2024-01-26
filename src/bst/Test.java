package bst;

public class Test {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        bst.insert(8);
        bst.insert(1);
        System.out.println(bst.search(8));
        System.out.println(bst.search(9));
        System.out.println(bst.search(1));


        System.out.println(bst.delete(8));
        System.out.println(bst.delete(9));

    }
}
