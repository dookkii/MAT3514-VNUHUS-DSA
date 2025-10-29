package vn.io.tunaa.dsa.week6_extra.binary_tree.ex2__sum_of_nodes;

public class Solution {
    /**
     * Tính tổng giá trị các đỉnh của cây.
     * @param root nút gốc của cây
     * @return tổng giá trị các đỉnh của cây
     */
    public int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.left.right.left = new Node(5);

        System.out.println((new Solution()).sumOfNodes(node));
    }
}