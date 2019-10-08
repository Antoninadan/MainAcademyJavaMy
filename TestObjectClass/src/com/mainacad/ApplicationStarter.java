package com.mainacad;

import com.mainacad.circle.Circle;

public class ApplicationStarter {
    public static void main(String[] args) {
        Object objOne = new Object();
        Object objTwo = new Object();
        System.out.println("objOne.hashCode() = " + objOne.hashCode());
        System.out.println("objTwo.hashCode() = " + objTwo.hashCode());
        System.out.println();

        String stringOne = "767676";
        String stringTwo = "767676";
        System.out.println("for string '" + stringOne + "' stringOne.hashCode() = " + stringOne.hashCode());
        System.out.println("stringTwo.hashCode() = " + stringTwo.hashCode());
        System.out.println("After stringOne = stringTwo: stringTwo.equals(stringTwo) = " + stringTwo.equals(stringOne));
        stringOne = stringTwo;
        System.out.println("After stringOne = stringTwo: stringOne.hashCode() = " + stringOne.hashCode());
        System.out.println("After stringOne = stringTwo: stringTwo.hashCode() = " + stringTwo.hashCode());
        System.out.println("After stringOne = stringTwo: stringTwo.equals(stringTwo) = " + stringTwo.equals(stringOne));
        System.out.println();

        Circle circleOne = new Circle(45.0);
        Circle circleTwo = new Circle(45.0);
        System.out.println("circleOne.hashCode() = " + circleOne.hashCode());
        System.out.println("circleTwo.hashCode() = " + circleTwo.hashCode());
        System.out.println("circleTwo.equals(circleTwo) = " + circleTwo.equals(circleOne));

        /*
         * Имеется связь между hash-кодом и сравнением. Если два объекта
         * одинаковы (с пользовательской, логической точки зрения), то их hash-коды также
         * должны быть одинаковы. Следовательно, если переопределяется метод
         * сравнения, то также должен переопределяться метод для получения hash-кода.
         */

    }


}
