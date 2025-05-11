// Given a binary tree, determine if it is height-balanced (A binary tree in which the depth of the two subtrees of every node never differs by more than one.).

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // eww...
    public static void main(String[] args) {
        myTreeNode root = new myTreeNode(3);
        root.left = new myTreeNode(9);
        root.right = new myTreeNode(20);
        root.right.right = new myTreeNode(7);
        root.right.right.right = new myTreeNode(6);
        root.left.left = new myTreeNode(3);
        root.left.left.left = new myTreeNode(2);

        System.out.println(isBalanced(root));
    }

    // balance-factor!
    public static boolean isBalanced(myTreeNode root) {
        Queue<myTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int bf = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                myTreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
                bf = balanceFactor(tmp);
                if (bf < -1 || bf > 1) return false;
            }
        }
        return true;
    }

    public static int balanceFactor(myTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return maxDepth(root.right) - maxDepth(root.left);
        }
    }

    public static int maxDepth(myTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}