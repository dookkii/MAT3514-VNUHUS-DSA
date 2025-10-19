package vn.io.tunaa.dsa.week5.queue.ex1__implementations;

public interface SimpleQueue<T> {
    void enqueue(T item);
    T dequeue();
    int size();
    boolean isEmpty();
}