public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        //set base case of recursion so it will stop when it hits a null node
        if(root == null) {
            return null;
        }
        //recursively call this method by constantly creating new nodes that flip the tree
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
