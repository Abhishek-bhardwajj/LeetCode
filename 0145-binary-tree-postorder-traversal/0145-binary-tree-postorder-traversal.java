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
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<Boolean> expand = new Stack<Boolean>();
        s.push(root);
        expand.push(true);
        while (s.size() > 0) {
            boolean exp = expand.pop();
            if (exp == true) {
                expand.push(false);
                TreeNode node = s.peek();
                if (node.right != null) {
                    s.push(node.right);
                    expand.push(true);
                }
                if (node.left != null) {
                    s.push(node.left);
                    expand.push(true);
                }
                continue;
            }
            result.add(s.pop().val);
        }
        return result;
    }
}