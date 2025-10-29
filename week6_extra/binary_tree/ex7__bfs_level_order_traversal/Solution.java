package vn.io.tunaa.dsa.week6_extra.binary_tree.ex7__bfs_level_order_traversal;

import java.util.*;

public class Solution {
    /**
     * Duyệt cây theo chiều ngang (từ gốc xuống, trái sang phải) và in ra các phần tử cách nhau bởi một dấu cách.
     * @param root nút gốc của cây
     */
    public void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node != null) {
                System.out.print(node.data + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.left.right.left = new Node(5);

        (new Solution()).levelOrderTraversal(node);
    }
}