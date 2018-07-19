package com.company;

/**
 * created by s.a.miroshnychenko 7/16/2018
 */

public class Rectangle extends Shape {
    int x,y,j,z;

    public Rectangle(String color, int x, int y, int j, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.j = j;
        this.z = z;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", j=" + j +
                ", z=" + z +
                "} " + super.toString();
    }

}
