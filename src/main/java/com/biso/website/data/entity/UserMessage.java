package com.biso.website.data.entity;

/**
 * Created by biso on 16.07.17.
 */
public class UserMessage {

    String name;
    String email;
    String message;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
