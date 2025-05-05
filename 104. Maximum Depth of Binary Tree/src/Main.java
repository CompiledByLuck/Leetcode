/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // so traverse, but we have to keep track of the node height?
    public static void main(String[] args) {
        myTreeNode root = new myTreeNode(3);
        root.left = new myTreeNode(9);
        root.right = new myTreeNode(20);

        root.right.left = new myTreeNode(15);
        root.right.right = new myTreeNode(7);
        System.out.println(maxDepthBFS(root));
    }

    // recursive DFS
    public static int maxDepth(myTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    // BFS
    public static int maxDepthBFS(myTreeNode root) {
        if (root == null) return 0;

        Queue<myTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                myTreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            // end of the level
            depth += 1;
        }
        return depth;
    }
}