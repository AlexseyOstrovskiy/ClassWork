package com.company;

public class UserFactory {

    private boolean isBlocked = false;

    public UserFactory signIn (String login) {
        System.out.println("user sign in as" + login);
        return this;
    }

    public UserFactory sendMessage ( String message) {
        if (this.isBlocked) {
            System.out.println("user is blocked");
        } else {
            System.out.println("user received message:" + message);
        }
        return this;
    }

    public UserFactory activate () {
        this.isBlocked = false;
        return this;
    }

    public UserFactory deactivate () {
        this.isBlocked = true;
        return this;
    }

    public void signOut () {
        System.out.println("user sign out");
    }
}
