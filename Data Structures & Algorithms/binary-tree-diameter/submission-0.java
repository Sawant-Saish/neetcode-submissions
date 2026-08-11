/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maxDiameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        dia(root);
        return maxDiameter;
    }
    public int dia(TreeNode root){

        if(root==null)return 0;

        int rightDepth = dia(root.right);
        int leftDepth = dia(root.left);

        int temp = rightDepth+leftDepth;
        maxDiameter= Math.max(maxDiameter,temp);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
// here we each parent node needs height of the subtree beacuse while calulation the diameter of (comparing the max) the height of the subtree is what contibutes in the diameter of the tree.
