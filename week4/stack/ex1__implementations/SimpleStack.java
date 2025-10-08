package vn.io.tunaa.dsa.week4.stack.ex1__implementations;

public interface SimpleStack<T> {
    void push(T item);
    T pop();
    int size();
    boolean isEmpty();
}