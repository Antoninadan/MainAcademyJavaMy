package com.mainacad;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {

        Square squareOne = new Square();
        squareOne.setSide(1.0);
        squareOne.setName("Square");
        System.out.println(
                "Square with side " +
                        squareOne.getSide() + " has area " +
                        squareOne.getArea());

        Circle circleOne = new Circle();
        circleOne.setRadius(0.7);
        System.out.println(
                "Circle with radius " +
                        circleOne.getRadius() + " has area " +
                        circleOne.getArea());

        Triangle triangleOne = new Triangle();
        triangleOne.setSideOne(2.0);
        triangleOne.setSideTwo(3.0);
        triangleOne.setSideThree(4.0);
        System.out.println(
                "Triangle  with side one " + triangleOne.getSideOne()
                        + ", side two " + triangleOne.getSideTwo()
                        + ", side three " + triangleOne.getSideThree()
                        + " has area " +
                        triangleOne.getArea());
        System.out.println();

        Shape minShape;

        if (circleOne.getArea() < squareOne.getArea()) {
            minShape = circleOne;
        } else {
            minShape = squareOne;
        }

        if (triangleOne.getArea() < minShape.getArea()) {
            minShape = triangleOne;
        }
        System.out.println("Min shape area = " + minShape.getArea()
                + ", shape is " + minShape.getClass().getSimpleName());


    }

}
