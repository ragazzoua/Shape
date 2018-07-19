package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("red", 10, 10, 10);
        Circle circle1 = new Circle("red", 10, 10, 10);

        System.out.println(circle.toString());
        System.out.println(circle1.toString());
        System.out.println(circle.hashCode());
        System.out.println(circle1.hashCode());
        System.out.println(circle.equals(circle1));


    }
}
