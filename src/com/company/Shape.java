package com.company;

/**
 * created by s.a.miroshnychenko 7/16/2018
 */

public abstract class Shape {
    String color = "red";
    public abstract void draw();

    public Shape(String color) {
        this.color = color;
    }
}
