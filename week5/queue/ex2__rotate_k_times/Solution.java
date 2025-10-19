package vn.io.tunaa.dsa.week5.queue.ex2__rotate_k_times;

import java.util.*;

class Solution {

    /**
     * Dịch chuyển phần tử đầu tiên của queue xuống cuối queue, thực hiện k lần.
     *
     * @param a  mảng số nguyên đầu vào dùng để khởi tạo queue
     * @param n  số lượng phần tử của mảng (độ dài queue ban đầu)
     * @param k  số lần thực hiện phép biến đổi dịch chuyển
     * @return   Queue sau khi đã xoay (rotate) k lần
     */
    public Queue<Integer> rotate(int[] a, int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i : a) {
            queue.add(i);
        }

        for (int i = 0; i < k; i++) {
            int data = queue.remove();
            queue.add(data);
        }

        return queue;
    }
}