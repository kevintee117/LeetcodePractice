public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) {
            return false;
        }
        if (isSame(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode main, TreeNode comp) {
        if(main == null && comp == null) {
            return true;
        }
        if(main == null || comp == null) {
            return false;
        }
        if(main.val != comp.val) {
            return false;
        }
        return isSame(main.left, comp.left) && isSame(main.right, comp.right);
    }
}
