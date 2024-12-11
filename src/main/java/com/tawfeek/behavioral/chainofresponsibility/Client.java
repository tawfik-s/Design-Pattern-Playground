package com.tawfeek.behavioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {

        Database database = new Database();

        Handler handler = new UserExistHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.login("admin","admin");

    }
}
