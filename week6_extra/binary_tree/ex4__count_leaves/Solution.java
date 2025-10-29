package vn.io.tunaa.dsa.week6_extra.binary_tree.ex4__count_leaves;

public class Solution {
    /**
     * Đếm số lá của cây.
     * @param root nút gốc của cây
     * @return số lượng lá trong cây
     */
    public int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeaves(root.left) + countLeaves(root.right);
    }
}