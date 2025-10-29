package vn.io.tunaa.dsa.week7_revision._1_2.ex2__queue_and_tree;

@SuppressWarnings("unchecked")
public class LinkedListQueue<T> implements QueueInterface<T> {
    private Node front;
    private Node rear;

    class Node {
        T element;
        Node next;
    }

    @Override
    public void enqueue(T element) {
        Node newNode = new Node();
        newNode.element = element;

        if (rear != null) {
            rear.next = newNode;
        } else {
            front = newNode;
        }

        rear = newNode;
    }

    @Override
    public T dequeue() {
        if (front == null) {
            return null;
        }

        T data;
        Node node = front;
        data = front.element;

        front = front.next;

        if (node == rear) {
            rear = null;
        }

        return data;
    }

    @Override
    public boolean isEmpty() {
        return front == null && rear == null;
    }
}