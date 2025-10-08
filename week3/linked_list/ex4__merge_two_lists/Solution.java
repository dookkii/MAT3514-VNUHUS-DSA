package vn.io.tunaa.dsa.week3.linked_list.ex4__merge_two_lists;

public class Solution {
    class Node {
        int data;
        Node next;
    }

    /**
     * Gộp hai danh sách liên kết đã được sắp xếp thành duy nhất một danh sách mới được sắp xếp
     * @param head1: Nút đầu danh sách thứ nhất
     * @param head2: Nút đầu danh sách thứ hai
     * @return Nút đầu danh sách mới đã được gộp và sắp xếp
     */
    public Node mergeTwoLists(Node head1, Node head2) {
        Node result = new Node();
        Node current = result;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        if (head1 == null) {
            current.next = head2;
        }

        if (head2 == null) {
            current.next = head1;
        }

        return result.next;
    }
}