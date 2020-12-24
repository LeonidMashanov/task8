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
class Point {
    private double coordinatesX;
    private double coordinatesY;
    private int centerX;
    private int centerY;



    public Point(double coordinatesX, double coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    }
    public double getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(double coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public double getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(double coordinatesY) {
        this.coordinatesY = coordinatesY;
    }
    public double getPointX2() {
        return pointX2;
    }

    public void setPointX2(double pointX2) {
        this.pointX2 = pointX2;
    }

    public double getPointY2() {
        return pointY2;
    }

    public void setPointY2(double pointY2) {
        this.pointY2 = pointY2;
    }



    }



}
public class Main {

    public static void main(String[] args) {

    }
}
