package vn.io.tunaa.dsa.week6_extra.binary_tree.ex5__is_identical_tree;

public class Solution {
    /**
     * Kiểm tra xem hai cây nhị phân có giống nhau hay không.
     * Hai cây giống nhau nếu:
     *  - Cấu trúc giống nhau
     *  - Giá trị ở mỗi nút tương ứng giống nhau
     * @param root1 nút gốc của cây thứ nhất
     * @param root2 nút gốc của cây thứ hai
     * @return true nếu hai cây giống nhau, false nếu không
     */
    public boolean isIdenticalTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        return (root1.data == root2.data &&
                isIdenticalTree(root1.left, root2.left) &&
                isIdenticalTree(root1.right, root2.right));
    }
}