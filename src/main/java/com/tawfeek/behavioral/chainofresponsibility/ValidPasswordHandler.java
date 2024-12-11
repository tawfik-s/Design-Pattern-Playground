package com.tawfeek.behavioral.chainofresponsibility;

public class ValidPasswordHandler extends Handler {

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }
    @Override
    public boolean handle(String userName, String password) {
        if(!database.isValidPassword(userName, password)) {
            return false;
        }
        return handleNext(userName, password);
    }
}
