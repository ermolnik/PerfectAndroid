package com.ermolnik.perfectandroid.models;

public class UserModel {
    private final int id;
    private final String firstName;
    private final String lastName;

    public UserModel(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
