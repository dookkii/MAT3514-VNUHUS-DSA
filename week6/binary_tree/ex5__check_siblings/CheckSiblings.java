package vn.io.tunaa.dsa.week6.binary_tree.ex5__check_siblings;

@SuppressWarnings({"unchecked", "deprecation"})
class CheckSiblings {
    public boolean areSiblings(Node root, int val1, int val2) {
        if (root == null) {
            return false;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        if (
                (root.left.value == val1 && root.right.value == val2) ||
                (root.right.value == val1 && root.left.value == val2)
        ) {
            return true;
        }

        return areSiblings(root.left, val1, val2) || areSiblings(root.right, val1, val2);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right = new Node(3);

        System.out.println((new CheckSiblings()).areSiblings(node, 4, 5));
    }
}