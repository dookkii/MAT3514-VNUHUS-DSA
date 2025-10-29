package vn.io.tunaa.dsa.week6_extra.binary_tree.ex8__max_path_sum;

class Solution {
    // Biến toàn cục lưu trữ tổng lớn nhất có thể đạt được từ một đường đi
    private int globalMax = Integer.MIN_VALUE;

    /**
     * Tính tổng lớn nhất có thể đạt được từ một đường đi bất kỳ trong cây nhị phân.
     *
     * @param root node gốc của cây nhị phân cần xét
     * @return giá trị lớn nhất của tổng các node trên một đường đi bất kỳ trong cây
     */
    public int maxPathSum(Node root) {
        maxPathSumRecursive(root);
        return globalMax;
    }

    public int maxPathSumRecursive(Node root) {
        if (root == null) {
            return 0;
        }

        int maxLeft = Math.max(maxPathSumRecursive(root.left), 0);
        int maxRight = Math.max(maxPathSumRecursive(root.right), 0);

        int tmpSum = root.data + maxLeft + maxRight;
        globalMax = Math.max(globalMax, tmpSum);

        return root.data + Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        Node root = new Node(36);
        root.left = new Node(18);
        root.right = new Node(24);
        root.left.left = new Node(-36);
        root.left.right = new Node(67);
        root.right.left = new Node(-18);
        root.right.right = new Node(-24);

        System.out.println((new Solution()).maxPathSum(root));
    }
}