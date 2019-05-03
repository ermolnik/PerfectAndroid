
package com.ermolnik.perfectandroid.net.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dob {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("age")
    @Expose
    private long age;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Dob withDate(String date) {
        this.date = date;
        return this;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Dob withAge(long age) {
        this.age = age;
        return this;
    }

}
