package pij.day13.lab;

import java.util.Deque;
import java.util.LinkedList;

public class TreeNode<E> {
    private E data;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode(E data, TreeNode<E> left, TreeNode<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode(E data) {
        this(data, null, null);
    }

    public void printTreePreOrder() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.printTreePreOrder();
        }
        if (this.right != null) {
            this.right.printTreePreOrder();
        }
    }

    public void printTreeInOrder() {
        if (this.left != null) {
            this.left.printTreeInOrder();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.printTreeInOrder();
        }
    }

    public void printTreePostOrder() {
        if (this.left != null) {
            this.left.printTreePostOrder();
        }
        if (this.right != null) {
            this.right.printTreePostOrder();
        }
        System.out.println(this.data);
    }

    public void printTreePreOrderLoop() {
        Deque<TreeNode<E>> stack = new LinkedList<>();
        stack.push(this);
        while (!stack.isEmpty()) {
            TreeNode<E> node = stack.pop();

            System.out.println(node.data);
            // first push the Node that is to be visited /later/
            if (node.right != null) {
                stack.push(node.right);
            }
            // then push the Node to stack that is to be visited
            // /earlier/ (top-of-stack is popped next)
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}
