package com.chethan.datastructures.binarytree;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Iterative Traversals
 *  PreOrder  -> 1 stack --> Pop and Print, push right, push left
 *  InOrder   -> 1 stack --> while true, push node and traverse left, pop and print and traverse right
 *  PostOrder -> 2 stack --> Pop and push to s2, push left, push right
 */
public class BinaryTree {
    Node root;

    // Form a BST
    public Node insertIntoBST(int data){
        Node node = new Node(data);
        if(root == null){
            return node;
        }
        Node prev = null;
        Node cur = root;
        while(cur != null){
            prev = cur;
            if(data <= cur.getData()) {
                cur = cur.getLeft();
            }else{
                cur = cur.getRight();
            }
        }
        if(data <= prev.getData())
            prev.setLeft(node);
        else prev.setRight(node);

        return root;
    }

    public static void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.getData() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    // Print current, push right and then left node to stack
    public static void preOrderIterative(Node node){
        if(node == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node n = stack.pop();
            System.out.print(n.getData() + " ");
            if(n.getRight() != null)
                stack.push(n.getRight());
            if(n.getLeft() != null)
                stack.push(n.getLeft());
        }
        System.out.println();
    }

    public static void inOrder(Node node){
        if(node == null) return;
        inOrder(node.getLeft());
        System.out.print(node.getData() + " ");
        inOrder(node.getRight());
    }

    // Push current node and traverse left, pop from stack print it and traverse right
    public static void inOrderIterative(Node node){
        if(node == null) return;
        Stack<Node> stack = new Stack<>();
        while(true){
            if(node != null){
                stack.push(node);
                node = node.getLeft();
            }else {
                if(stack.isEmpty())
                    break;
                node = stack.pop();
                System.out.print(node.getData() + " ");
                node = node.getRight();
            }
        }
        System.out.println();
    }

    public static void postOrder(Node node){
        if(node == null) return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    // Push element in stack, pop and insert into another stack, push left and right to stack
    public static void postOrderIterative(Node node){
        if(node == null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(node);
        while(!stack1.isEmpty()){
            Node n = stack1.pop();
            stack2.push(n);
            if(n.getLeft() != null)
                stack1.push(n.getLeft());
            if(n.getRight() != null)
                stack1.push(n.getRight());
        }

        while(!stack2.isEmpty()){
            Node n = stack2.pop();
            System.out.print(n.getData() + " ");
        }
        System.out.println();
    }

    public static void levelOrder(Node node){
        if(node == null){
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            System.out.print(n.getData() + " ");
            if(n.getLeft() != null)
                queue.offer(n.getLeft());
            if(n.getRight() != null)
                queue.offer(n.getRight());
        }
        return;
    }

    public static int size(Node node){
        if(node == null)
            return 0;
        int leftSize = size(node.getLeft());
        int rightSize = size(node.getRight());
        return 1 + leftSize + rightSize;
    }

    public static int height(Node node){
        if(node == null)
            return 0;
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());
        return 1 + Math.max(leftHeight, rightHeight);
    }

    /**
     * If leaf node compare to sum and add to list
     * Traverse left by reducing the current node data if true add to list
     * Traverse right by reducing the current node data if true add to list
     */
    public static boolean rootToLeafSum(Node node, int sum, List<Node> nodeList){
        if(node == null) return false;
        // leaf node
        if(node.getLeft() == null && node.getRight() == null){
            if(node.getData() == sum){
                nodeList.add(node);
                return true;
            }
            return false;
        }
       if(rootToLeafSum(node.getLeft(), sum-node.getData(), nodeList)) {
           nodeList.add(node);
           return true;
       }
        if(rootToLeafSum(node.getRight(), sum-node.getData(), nodeList)) {
            nodeList.add(node);
            return true;
        }
        return false;
    }

    /**
     *  Restrict nodes with bounds and check if condition is satisfied
     */
    public static boolean isBST(Node node, int min, int max){
        if(node == null) return true;
        if(node.getData() <= min || node.getData() >= max)
            return false;
        return isBST(node.getLeft(), min, node.getData()) && isBST(node.getRight(), node.getData(), max);
    }
}
