public class Main {
    public static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int sumNodes(TreeNode root) {
        if (root == null) return 0;
        return root.data + sumNodes(root.left) + sumNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Sum of all nodes: " + sumNodes(root));
    }
}
