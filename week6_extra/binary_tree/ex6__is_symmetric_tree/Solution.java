package vn.io.tunaa.dsa.week6_extra.binary_tree.ex6__is_symmetric_tree;

class Solution {
    /**
     * Kiểm tra cây có đối xứng.
     *
     * @param root node gốc của cây nhị phân cần xét
     * @return true nếu cây đối xứng, false nếu ngược lại
     */
    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return (isMirror(node1.left, node2.right) &&
                isMirror(node1.right, node2.left));
    }
}