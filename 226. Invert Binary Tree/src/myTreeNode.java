public class myTreeNode {
    int val;
    myTreeNode left;
    myTreeNode right;

    myTreeNode() {
    }

    myTreeNode(int val) {
        this.val = val;
    }

    myTreeNode(int val, myTreeNode left, myTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}