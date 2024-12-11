package com.tawfeek.behavioral.iterator;

interface Iterator<T> {
    boolean hasNext();
    T getNext();
    void reset();
}
