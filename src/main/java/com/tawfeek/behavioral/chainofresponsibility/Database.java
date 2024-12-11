package com.tawfeek.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String,String> users;

    public Database() {
        users = new HashMap<>();
        users.put("admin", "admin");
        users.put("user", "user");
        users.put("manager", "manager");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public Boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }


}
