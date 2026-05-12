import java.util.ArrayDeque;
import java.util.Deque;

public class maximumDepth {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
    }
}
