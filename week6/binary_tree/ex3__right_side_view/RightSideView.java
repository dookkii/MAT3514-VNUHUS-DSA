package vn.io.tunaa.dsa.week6.binary_tree.ex3__right_side_view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int tmp = queue.size();

            for (int i = 0; i < tmp; i++) {
                TreeNode node = queue.poll();

                if (node != null) {
                    if (i == tmp - 1) {
                        result.add(node.val);
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(5);

        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);

        System.out.println((new RightSideView()).rightSideView(node));
    }
}