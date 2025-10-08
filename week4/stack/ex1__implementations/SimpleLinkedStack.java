package vn.io.tunaa.dsa.week4.stack.ex1__implementations;

public class SimpleLinkedStack<T> implements SimpleStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    public SimpleLinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * Thêm một phần tử vào đỉnh ngăn xếp.
     * @param item phần tử cần thêm
     */
    @Override
    public void push(T item) {
        if (isEmpty()) {
            top = new Node<>(item);
        } else {
            Node<T> newNode = new Node<>(item);

            newNode.next = top;
            top = newNode;
        }

        size++;
    }

    /**
     * Lấy và loại bỏ phần tử ở đỉnh ngăn xếp.
     * @return phần tử ở đỉnh ngăn xếp, hoặc null nếu ngăn xếp rỗng
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        Node<T> tmp;
        tmp = top;
        top = top.next;

        size--;
        return tmp.data;
    }

    /**
     * Trả về số lượng phần tử hiện có trong ngăn xếp.
     * @return số lượng phần tử trong ngăn xếp
     */
    public int size() {
        return size;
    }

    /**
     * Kiểm tra xem ngăn xếp có rỗng hay không.
     * @return true nếu ngăn xếp rỗng, false nếu không
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Trả về chuỗi mô tả các phần tử trong ngăn xếp từ đỉnh xuống đáy.
     * @return chuỗi thể hiện trạng thái hiện tại của ngăn xếp
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = top;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}