package vn.io.tunaa.dsa.week6_extra.binary_tree.ex1__binary_tree_traversal;

public class BinaryTreeTraversal {
    /**
     * Duyệt cây theo thứ tự trung vị và in ra các phần tử cách nhau bởi 1 dấu cách.
     * @param root nút gốc của cây
     */
    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    /**
     * Duyệt cây theo thứ tự trước và in ra các phần tử cách nhau bởi 1 dấu cách.
     * @param root nút gốc của cây
     */
    public void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    /**
     * Duyệt cây theo thứ tự sau và in ra các phần tử cách nhau bởi 1 dấu cách.
     * @param root nút gốc của cây
     */
    public void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}