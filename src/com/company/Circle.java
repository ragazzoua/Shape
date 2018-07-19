package com.company;

import java.util.Objects;

/**
 * created by s.a.miroshnychenko 7/16/2018
 */

public class Circle extends Shape{
    int x;
    int y;
    int r;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                r == circle.r;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, r);
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                "} ";
    }

}
