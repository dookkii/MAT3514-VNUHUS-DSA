package vn.io.tunaa.dsa.week3.linked_list.ex5__has_cycle;

public class Solution {
    public static class Node {
        int data;
        Node next;
    }

    /**
     * Kiểm tra xem cấu trúc liên kết có chứa chu trình không
     * @param head: Nút đầu của cấu trúc liên kết
     * @return true nếu có chu trình, false nếu trái lại
     */
    public boolean hasCycle(Node head) {
        Node node1 = head;
        Node node2 = head;

        while (node2 != null && node2.next != null) {
            if (node1 == node2) {
                return true;
            } else {
                node1 = node1.next;
                node2 = node2.next.next;
            }
        }

        return false;
    }
}