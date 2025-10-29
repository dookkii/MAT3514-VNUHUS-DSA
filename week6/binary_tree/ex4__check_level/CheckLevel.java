package vn.io.tunaa.dsa.week6.binary_tree.ex4__check_level;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings({"unchecked", "deprecation"})
class CheckLevel {
    public boolean isSameLevel(Node root, int val1, int val2) {
        if (root == null) {
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean check1, check2;

        while (!queue.isEmpty()) {
            check1 = false;
            check2 = false;
            int tmp = queue.size();

            for (int i = 0; i < tmp; i++) {
                Node node = queue.poll();

                if (node != null) {
                    if (node.value == val1) {
                        check1 = true;
                    }

                    if (node.value == val2) {
                        check2 = true;
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }

                if (check1 && check2) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right = new Node(3);

        System.out.println((new CheckLevel()).isSameLevel(node, 2, 3));
    }
}