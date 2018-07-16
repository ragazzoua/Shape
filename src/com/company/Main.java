package com.company;

public class Main {

    public static void main(String[] args) {
        Shape a[] = new Shape[3];
        a[0] = new Circle("grenn", 10,12,13);
        a[1] = new Rectangle("grenn", 10,12,13, 20);
        a[2] = new Circle("red", 10,10,10);

        for (Shape shape : a) {
            shape.draw();
        }
    }
}
