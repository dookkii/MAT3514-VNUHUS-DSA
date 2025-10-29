package vn.io.tunaa.dsa.week6_extra.binary_tree.ex3__depth;

public class Solution {
    /**
     * Tìm độ sâu của cây
     * @param root nút gốc của cây
     * @return độ sâu của cây
     */
    public int depth(Node root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = depth(root.left);
        int depthRight = depth(root.right);

        return Math.max(depthLeft, depthRight) + 1;
    }
}