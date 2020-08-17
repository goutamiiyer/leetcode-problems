public class DiameterOfBinaryTree {
    int maximum;
    public int diameterOfBinaryTree(TreeNode root) {
        maximum = 1;
        dfs(root);
        return maximum-1;
    }
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int value;
        if (root.left != null) {
            value = root.left.val;
        }
        int leftTree = dfs(root.left);
        if (root.right != null) {
            value = root.right.val;
        }
        int rightTree = dfs(root.right);
        maximum = Math.max(maximum, leftTree + rightTree + 1);
        int result = Math.max(leftTree, rightTree)+1;
        return result;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree dobt = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int output = dobt.diameterOfBinaryTree(root);
        System.out.println(output);
    }
}
