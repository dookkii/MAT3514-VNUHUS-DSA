package vn.io.tunaa.dsa.week3.linked_list.ex2__reverse;

public class Solution {
    class Node {
        int data;
        Node next;
    }

    /**
     * Đảo ngược danh sách liên kết đơn
     * @param head: Nút đầu của danh sách
     * @return nút đầu mới của danh sách đã đảo ngược
     */
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node nodes = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return nodes;
    }
}