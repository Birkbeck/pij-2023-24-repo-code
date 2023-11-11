package pij.day13;

import java.util.Collections;
import java.util.List;

public class TreeDriver {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>(
                new TreeNode<>(1,
                        new TreeNode<>(2,
                                new TreeNode<>(4),
                                new TreeNode<>(5)),
                        new TreeNode<>(3,
                                new TreeNode<>(6),
                                new TreeNode<>(7)))
        );
        System.out.println("preOrder: ");
        tree.printTreePreOrder();
        System.out.println("inOrder: ");
        tree.printTreeInOrder();
        System.out.println("postOrder: ");
        tree.printTreePostOrder();
        System.out.println("preOrderLoop: ");
        tree.printTreePreOrderLoop();
    }
}
