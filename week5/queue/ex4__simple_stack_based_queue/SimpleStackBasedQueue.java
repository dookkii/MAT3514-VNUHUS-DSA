package vn.io.tunaa.dsa.week5.queue.ex4__simple_stack_based_queue;

import java.util.Stack;

public class SimpleStackBasedQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public SimpleStackBasedQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    /**
     * Thêm phần tử vào cuối hàng đợi.
     * @param item phần tử cần thêm
     */
    public void enqueue(int item) {
        stackIn.push(item);
    }

    /**
     * Loại bỏ phần tử ở đầu hàng đợi.
     * @return phần tử bị loại bỏ
     * @throws RuntimeException nếu hàng đợi rỗng
     */
    public int dequeue() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        return stackOut.pop();
    }

    /**
     * Kiểm tra xem hàng đợi có rỗng hay không.
     * @return true nếu rỗng, false nếu không
     */
    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    /**
     * Trả về số lượng phần tử hiện có trong hàng đợi.
     * @return số phần tử
     */
    public int size() {
        return stackIn.size() + stackOut.size();
    }

    /**
     * Trả về chuỗi biểu diễn hàng đợi từ đầu đến cuối.
     * @return chuỗi thể hiện trạng thái hàng đợi
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = stackOut.size() - 1; i >= 0; i--) {
            sb.append(stackOut.get(i));
            if (i > 0 || !stackIn.isEmpty()) {
                sb.append(" -> ");
            }
        }
        for (int i = 0; i < stackIn.size(); i++) {
            sb.append(stackIn.get(i));
            if (i < stackIn.size() - 1) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}