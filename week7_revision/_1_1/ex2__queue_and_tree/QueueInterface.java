package vn.io.tunaa.dsa.week7_revision._1_1.ex2__queue_and_tree;

public interface QueueInterface<T> {
    public void enqueue(T element);

    public T dequeue();

    public boolean isEmpty();
}