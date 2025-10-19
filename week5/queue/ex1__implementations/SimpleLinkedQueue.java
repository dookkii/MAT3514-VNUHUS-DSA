package vn.io.tunaa.dsa.week5.queue.ex1__implementations;

public class SimpleLinkedQueue<T> implements SimpleQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    public SimpleLinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /**
     * Thêm một phần tử vào cuối hàng đợi.
     * @param item phần tử cần thêm
     */
    @Override
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);

        if (rear != null) {
            rear.next = newNode;
        } else {
            front = newNode;
        }

        rear = newNode;
        size++;
    }

    /**
     * Lấy và loại bỏ phần tử ở đầu hàng đợi.
     * @return phần tử ở đầu hàng đợi, hoặc null nếu hàng đợi rỗng
     */
    @Override
    public T dequeue() {
        if (front == null) {
            return null;
        }

        Node<T> node = front;
        front = front.next;

        if (node == rear) {
            rear = null;
        }

        size--;
        return node.data;
    }

    /**
     * Trả về số lượng phần tử hiện có trong hàng đợi.
     * @return số lượng phần tử trong hàng đợi
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Kiểm tra xem hàng đợi có rỗng hay không.
     * @return true nếu hàng đợi rỗng, false nếu không
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Trả về chuỗi mô tả các phần tử trong hàng đợi từ đầu đến cuối.
     * @return chuỗi thể hiện trạng thái hiện tại của hàng đợi
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = front;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}