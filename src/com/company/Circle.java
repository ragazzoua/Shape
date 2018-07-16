package com.company;

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
    public void draw() {
        System.out.println("Circle");
    }
}
