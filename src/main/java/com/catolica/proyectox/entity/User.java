package com.catolica.proyectox.entity;

public class User {
    private int ci;
    private String name;
    private String lastname;
    private int age;

    public User(int ci, String name, String lastname, int age) {
        this.ci = ci;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
