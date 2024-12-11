package com.tawfeek.behavioral.chainofresponsibility;

public class AuthService {

    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String username, String password) {
        if(handler.handle(username, password)) {
            System.out.println("auth success");
            return true;
        }
        return false;
    }
}
