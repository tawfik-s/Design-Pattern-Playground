package com.tawfeek.chainofresponsibility;

public abstract class Handler {

    public Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String userName,String password);


    protected boolean handleNext(String userName,String password) {
        if(next != null) {
            return next.handle(userName,password);
        }
        return true;
    }
}
