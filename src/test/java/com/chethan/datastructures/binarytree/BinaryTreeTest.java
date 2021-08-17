package com.chethan.datastructures.binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTest {
    private BinaryTree tree;

    @BeforeEach
    void init(){
        tree = new BinaryTree();
        tree.root = tree.insertIntoBST(10);
        tree.root = tree.insertIntoBST(5);
        tree.root = tree.insertIntoBST(8);
        tree.root = tree.insertIntoBST(4);
        tree.root = tree.insertIntoBST(12);
        tree.root = tree.insertIntoBST(11);
        tree.root = tree.insertIntoBST(15);
        tree.root = tree.insertIntoBST(14);
    }

    @AfterEach
    void cleanup(){
        tree = null;
    }

    @Test
    void recursiveTreeTraversals(){
        System.out.print("Pre Order Traversal --> " );
        BinaryTree.preOrder(tree.root);
        System.out.print("\nIn Order Traversal --> " );
        BinaryTree.inOrder(tree.root);
        System.out.print("\nPost Order Traversal --> " );
        BinaryTree.postOrder(tree.root);
    }

    @Test
    void levelOrderTraversal(){
        System.out.print("\nLevel Order Traversal --> " );
        BinaryTree.levelOrder(tree.root);
    }

    @Test
    void iterativeTreeTraversals(){
        System.out.print("Pre Order Iterative Traversal --> " );
        BinaryTree.preOrderIterative(tree.root);
        System.out.print("In Order Iterative Traversal --> " );
        BinaryTree.inOrderIterative(tree.root);
        System.out.print("Post Order Iterative Traversal --> " );
        BinaryTree.postOrderIterative(tree.root);
    }

    @Test
    void treeProperties(){
        System.out.println("\nSize of Tree --> " + BinaryTree.size(tree.root));
        System.out.println("Height of Tree --> " + BinaryTree.height(tree.root));
    }

    @Test
    void rootToLeafSum(){
        System.out.print("Root to leaf sum -->");
        List<Node> nodeList = new ArrayList<>();
        BinaryTree.rootToLeafSum(tree.root, 19, nodeList);
        System.out.println(nodeList);
    }

    @Test
    void isBST(){
        System.out.print("Is Binary Search Tree -->");
        System.out.println(BinaryTree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
