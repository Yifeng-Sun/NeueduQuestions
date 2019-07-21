package TreeNode;

import java.util.ArrayList;
import java.util.List;
         /*  3
            / \
            9  20
              /  \
             15   7*/

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    public static List<List<Integer>> levelorder = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);//至此二叉树构建完毕
        Solution.levelorder(root);
    }
}

class Solution {
    public static List<List<Integer>> levelorder(TreeNode root) {
        ArrayList<Integer> thisLevel = new ArrayList<Integer>();
        if(root.left != null){
            thisLevel.add(root.left.val);
            levelorder(root.left);
        }
        if(root.right != null){
            thisLevel.add(root.right.val);
            levelorder(root.right);
        }
        TreeNode.levelorder.add(thisLevel);

        return TreeNode.levelorder;
    }
}
