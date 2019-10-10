package com.mainacad;

import com.mainacad.abs.Shape;
import model.circle.Circle;
import model.square.Square;
import model.triangle.Triangle;
import service.ShapeCollactionService;

import java.util.*;

public class ApplicationRunner {

    public static void main(String[] args) {

        List<Shape> shapeList = getAndPrintShapeListExampls();
        System.out.println();

        // test realization by service on NOT empty list
        System.out.println("Test service:");
        Double minShapeArea = ShapeCollactionService.getMinShapeArea(shapeList);
        System.out.println(" Min shape area = " + minShapeArea);

        Double maxShapeArea = ShapeCollactionService.getMaxShapeArea(shapeList);
        System.out.println(" Max shape area = " + maxShapeArea);
        System.out.println();


        // test realization by service on empty list
        System.out.println("Test service with empty list:");
        List<Shape> shapeListEmpty = new ArrayList<>();
        minShapeArea = ShapeCollactionService.getMinShapeArea(shapeListEmpty);
        System.out.println(" Min shape area = " + minShapeArea);
        System.out.println();


        // test realization by TreeSet
        System.out.println("Test TreeSet:");
        SortedSet<Shape> set = new TreeSet<>(shapeList);
        minShapeArea = set.first().getArea();
        System.out.println(" Min shape area = " + minShapeArea);

        maxShapeArea = set.last().getArea();
        System.out.println(" Max shape area = " + maxShapeArea);

    }

    public static List<Shape> getAndPrintShapeListExampls(){
        Square squareOne = new Square(1.0);
        System.out.println(
                "Square with side " +
                        squareOne.getSide() + " has area " +
                        squareOne.getArea());
        Square squareTwo = new Square(2.0);
        System.out.println(
                "Square with side " +
                        squareTwo.getSide() + " has area " +
                        squareTwo.getArea());
        Square squareThree = new Square(3.0);
        System.out.println(
                "Square with side " +
                        squareThree.getSide() + " has area " +
                        squareThree.getArea());
        Circle circleOne = new Circle(1.0);
        System.out.println(
                "Circle with radius " +
                        circleOne.getRadius() + " has area " +
                        circleOne.getArea());
        Circle circleTwo = new Circle(2.0);
        System.out.println(
                "Circle with radius " +
                        circleTwo.getRadius() + " has area " +
                        circleTwo.getArea());
        Circle circleThree = new Circle(3.0);
        System.out.println(
                "Circle with radius " +
                        circleThree.getRadius() + " has area " +
                        circleThree.getArea());
        Triangle triangleOne = new Triangle(1.0, 1.0, 1.0);
        System.out.println(
                "Triangle  with side one " + triangleOne.getSideOne()
                        + ", side two " + triangleOne.getSideTwo()
                        + ", side three " + triangleOne.getSideThree()
                        + " has area " +
                        triangleOne.getArea());
        Triangle triangleTwo = new Triangle(2.0, 2.0, 2.0);
        System.out.println(
                "Triangle  with side one " + triangleTwo.getSideOne()
                        + ", side two " + triangleTwo.getSideTwo()
                        + ", side three " + triangleTwo.getSideThree()
                        + " has area " +
                        triangleTwo.getArea());
        Triangle triangleThree = new Triangle(3.0, 3.0, 3.0);
        System.out.println(
                "Triangle  with side one " + triangleThree.getSideOne()
                        + ", side two " + triangleThree.getSideTwo()
                        + ", side three " + triangleThree.getSideThree()
                        + " has area " +
                        triangleThree.getArea());

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(squareOne);
        shapeList.add(squareTwo);
        shapeList.add(squareThree);
        shapeList.add(circleOne);
        shapeList.add(circleTwo);
        shapeList.add(circleThree);
        shapeList.add(triangleOne);
        shapeList.add(triangleTwo);
        shapeList.add(triangleThree);

        return shapeList;
    }
}
