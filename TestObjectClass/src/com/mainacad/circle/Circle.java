package com.mainacad.circle;

public class Circle {
    private double radius;

    public byte byteOne;
    public short shortOne;
    public long longOne;
    public char characterOne;
    public float floatOne;
    public double doubleOne;
    public boolean booleanOne;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
