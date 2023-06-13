package RedBlackTree;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.add(5);
        tree.add(1);
        tree.add(3);
        tree.add(8);
        tree.add(7);
        tree.add(2);
        tree.add(9);

        tree.printTree();
    }
}
