public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Use DFS to compare the two trees
        //if both trees are null, they are the same so return true
        if (p == null && q == null) {
            return true;
        }
        //if one of them is null and one isn't they aren't the same so return false
        if (p == null || q == null) {
            return false;
        }
        //if the values are not the same, return false
        if (p.val != q.val) {
            return false;
        }
        //recursively call this method comparing their left and right nodes until they
        //hit the base cases above
        return this.isSameTree(p.right, q.right) & this.isSameTree(p.left, q.left);
    }
}

