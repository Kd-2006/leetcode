// Last updated: 7/14/2026, 3:59:20 PM
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned == null)
            return null;
        if (cloned.val == target.val)
            return cloned;
        TreeNode left = getTargetCopy(original, cloned.left, target);
        if (left != null)
            return left;
        return getTargetCopy(original, cloned.right, target);
    }
}