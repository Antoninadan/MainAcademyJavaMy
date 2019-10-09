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
        System.out.println("for string '" + stringTwo + "' stringTwo.hashCode() = " + stringTwo.hashCode());
        stringTwo = "AAAAAAAAAA";
        System.out.println("for string '" + stringTwo + "' stringTwo.hashCode() = " + stringTwo.hashCode());
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
        System.out.println();

        /*
         * Имеется связь между hash-кодом и сравнением. Если два объекта
         * одинаковы (с пользовательской, логической точки зрения), то их hash-коды также
         * должны быть одинаковы. Следовательно, если переопределяется метод
         * сравнения, то также должен переопределяться метод для получения hash-кода.
         */

        // Test primitive types
        byte	byteOne;
//        System.out.println("byteOne = " + byteOne); // error: need initialization
        short	shortOne;
//        System.out.println("shortOne = " + shortOne); // error: need initialization
        long	longOne;
//        System.out.println("longOne = " + longOne); // error: need initialization
        char	characterOne;
//        System.out.println("characterOne = " + characterOne); // error: need initialization
        float	floatOne;
//        System.out.println("floatOne = " + floatOne); // error: need initialization
        double	doubleOne;
//        System.out.println("doubleOne = " + doubleOne); // error: need initialization
        boolean	booleanOne;
//        System.out.println("booleanOne = " + booleanOne); // error: need initialization


        System.out.println("circleOne.byteOne = " + circleOne.byteOne); // 0
        System.out.println("circleOne.shortOne = " + circleOne.shortOne); // 0
        System.out.println("circleOne.longOne = " + circleOne.longOne); // 0L
        System.out.println("circleOne.characterOne = " + circleOne.characterOne); // null
        System.out.println("circleOne.floatOne = " + circleOne.floatOne); // 0.0f
        System.out.println("circleOne.doubleOne = " + circleOne.doubleOne); // 0.0d
        System.out.println("circleOne.booleanOne = " + circleOne.booleanOne); // false

        
    }


}
