package com.company;

class Dog {
    private String name;

    public Dog(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void castVote() {
        System.out.println("GAV");
    }

    public void giveAPaw(Dog dog) {
        System.out.println("a Dog " + name + " give a paw");
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
