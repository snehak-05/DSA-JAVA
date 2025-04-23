import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    static int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    static int count(TreeNode root){
        if(root==null) return 0;
        return 1 + count(root.left)+count(root.right);
    }

    static boolean searchValue(TreeNode root,int key){
        if(root==null) return false;
        if(root.data==key) return true;
        return searchValue(root.left,key) || searchValue(root.right,key);
    }

    static int searchNodes(TreeNode root){
        if(root.left==null || root.right==null) return 0;
        return  1+ searchNodes(root.right) +searchNodes(root.left);
    }
    static int sum(TreeNode root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        System.out.println("Height of the tree: " + getHeight(root));
        System.out.println("Count: "+ count(root));

        System.out.println("Is 4 present ?" + searchValue(root,40));
        System.out.println("How many nodes present "+ searchNodes(root));
        System.out.println("Sum:"+ sum(root));
    }
}
