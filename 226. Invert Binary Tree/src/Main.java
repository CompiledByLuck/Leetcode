//Given the root of a binary tree, invert the tree, and return its root.

public class Main {
    public static void main(String[] args) {
        myTreeNode root = new myTreeNode(10);
        root.left = new myTreeNode(5);
        root.right = new myTreeNode(20);
        root.left.left = new myTreeNode(3);
        root.left.right = new myTreeNode(7);

        invertTree(root);
    }

    // recursive postorder DFS with the help of ChatGPT :c
    public static myTreeNode invertTree(myTreeNode root) {
        if (root == null) return null;

        invertTree(root.left);
        invertTree(root.right);

        myTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }
}