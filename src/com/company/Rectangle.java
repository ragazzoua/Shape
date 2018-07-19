package com.company;

import java.util.Objects;

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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x &&
                y == rectangle.y &&
                j == rectangle.j &&
                z == rectangle.z;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, j, z);
    }
}
