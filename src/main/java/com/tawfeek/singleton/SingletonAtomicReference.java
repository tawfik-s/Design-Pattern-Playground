package com.tawfeek.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonAtomicReference {

    private static AtomicReference<SingletonAtomicReference> instance ;

    private String data;

    private SingletonAtomicReference(String data) {
        this.data = data;
    }

    public static SingletonAtomicReference getInstance(String data) {

        instance.compareAndSet(null, new SingletonAtomicReference(data));

        return instance.get();
    }

    public String getData() {
        return data;
    }
}
