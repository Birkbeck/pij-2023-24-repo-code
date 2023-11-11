package pij.day13;

import java.util.List;

public class Tree<E> {
    private TreeNode<E> root;

    public Tree(TreeNode<E> root) {
        this.root = root;
    }

    public Tree() {
        this(null);
    }

    public void printTreePreOrder() {
        if (this.root != null) {
            this.root.printTreePreOrder();
        }
    }
    public void printTreeInOrder() {
        if (this.root != null) {
            this.root.printTreeInOrder();
        }
    }
    public void printTreePostOrder() {
        if (this.root != null) {
            this.root.printTreePostOrder();
        }
    }
    public void printTreePreOrderLoop() {
        if (this.root != null) {
            this.root.printTreePreOrderLoop();
        }
    }
}
