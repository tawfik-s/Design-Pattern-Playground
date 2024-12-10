package com.tawfeek.chainofresponsibility;

public class RoleCheckHandler extends Handler {


    @Override
    public boolean handle(String userName, String password) {
        if(!"admin".equals(userName)){
            return false;
        }
        return handleNext(userName, password);
    }
}
