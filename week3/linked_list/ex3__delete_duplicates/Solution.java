package vn.io.tunaa.dsa.week3.linked_list.ex3__delete_duplicates;

public class Solution {
    class Node {
        int data;
        Node next;
    }

    /**
     * Xóa các phần tử trùng lặp trong sanh sách liên kết
     * @param head: Nút đầu của danh sách liên kết đã được sắp xếp
     * @return nút đầu mới của danh sách đã được xóa các phần tử trùng lặp
     */
    public Node deleteDuplicates(Node head) {
        Node node = head;

        while (node != null && node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}