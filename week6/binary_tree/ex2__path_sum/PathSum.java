package vn.io.tunaa.dsa.week6.binary_tree.ex2__path_sum;

class PathSum {
    public static boolean checkPathSum(TreeNode node, int sum, int targetSum) {
        if (node == null) {
            return false;
        }

        sum = sum + node.val;

        if (node.left == null && node.right == null) {
            return sum == targetSum;
        }

        return checkPathSum(node.left, sum, targetSum) || checkPathSum(node.right, sum, targetSum);
    }
    public boolean hasPathSum1(TreeNode root, int targetSum) {
        return checkPathSum(root, 0, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);

        node.right = new TreeNode(8);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(1);

        System.out.println((new PathSum()).hasPathSum(node, 22));
    }
}