package vn.io.tunaa.dsa.week6.binary_tree.ex1__sum_numbers;

@SuppressWarnings({"unchecked", "deprecation"})
class SumNumbersTest {
    public static int sumPath(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }

        return sumPath(node.left, sum) + sumPath(node.right, sum);
    }

    public int sumNumbers(TreeNode root) {
        return sumPath(root, 0);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        node1.left = new TreeNode(9);
        node1.left.left = new TreeNode(5);
        node1.left.right = new TreeNode(1);
        node1.right = new TreeNode(0);

        TreeNode node2 = new TreeNode(1);
        node2.left = new TreeNode(2);
        node2.right = new TreeNode(3);

        System.out.println((new SumNumbersTest()).sumNumbers(node1));
        System.out.println((new SumNumbersTest()).sumNumbers(node2));
    }
}