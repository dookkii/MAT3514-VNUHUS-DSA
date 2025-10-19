package vn.io.tunaa.dsa.week5.queue.ex3__recent_counter;

import java.util.*;

class RecentCounter {

    Queue<Integer> recentCalls;

    public RecentCounter() {
        recentCalls = new LinkedList<>();
    }

    /*
     * Thêm thời cuộc gọi tại thời điểm t và xóa các cuộc gọi đã quá 3000 ms trong recentCalls, trả về số cuộc gọi trong khoảng 3001ms
     * @param t thời điểm của cuộc gọi hiện tại
     * @return số cuộc gọi trong khoảng 3000ms tính cả cuộc gọi vừa thêm
     */
    public int ping(int t) {
        recentCalls.add(t);

        if (!recentCalls.isEmpty()) {
            int currentT = recentCalls.peek();

            while (currentT < t - 3000) {
                recentCalls.remove();

                if (!recentCalls.isEmpty()) {
                    currentT = recentCalls.peek();
                }
            }
        }

        return recentCalls.size();
    }
}