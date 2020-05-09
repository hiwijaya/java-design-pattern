package com.hiwijaya.pattern.factorymethod;

public interface Shape {
    void draw();
}

class Line implements Shape {

    public void draw() {
        System.out.println("Line drawn.");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Rectangle drawn.");
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Circle drawn.");
    }
}
