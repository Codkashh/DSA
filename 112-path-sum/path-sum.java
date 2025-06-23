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
    // Recursive solution.
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false; // Base case

        if (root.left == null && root.right == null) {
            // It's a leaf node! Check if Sum equals the targetSum
            return root.val == targetSum;
        }

        targetSum -= root.val; // New Target for next iterations

        // Next iterations
        return (hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum));
    }
}