package com.mainacad;

//import com.mainacad.packageOne.ClassOne;

import com.mainacad.packageThree.ClassTwoInherited;
import com.mainacad.packageTwo.ClassTwo;
import com.mainacad.packageTwo.ClassTwoInheritedThisPackage;


public class ApplicationStarter {

    public static class ClassStarterOne {
        int fieldDafault;
        public int fieldPublic;
        private int fieldPrivate;
        protected int fieldProtected;
    }

    public static void main(String[] args) {

        // this class allowed all fields (default, public, private, protected)
        ClassStarterOne classStarterOne = new ClassStarterOne();
        System.out.println("classStarterOne default field = " + classStarterOne.fieldDafault);
        System.out.println("classStarterOne protected field = " + classStarterOne.fieldProtected);
        System.out.println("classStarterOne public field = " + classStarterOne.fieldPublic);
        System.out.println("classStarterOne private field = " + classStarterOne.fieldPrivate);
        System.out.println();

        // PACKAGE class NOT allowed off package
//        ClassOne classOne = new ClassOne();

        // PUBLIC class allowed
        ClassTwo classTwo = new ClassTwo();
//        System.out.println("classTwo default field = " + classTwo.fieldDafaultClassTwo);        // not allowed here (different package)
//        System.out.println("classTwo protected field = " + classTwo.fieldProtectedClassTwo);   // not allowed here
        System.out.println("classTwo public field = " + classTwo.fieldPublicClassTwo);
//        System.out.println("classTwo private field = " + classTwo.fieldPrivateClassTwo);       // not allowed here

        ClassTwoInherited classTwoInherited = new ClassTwoInherited();
//        System.out.println("classTwoInherited default field by classTwo = " + classTwoInherited.fieldDafaultClassTwo);        // not allowed here (different package)
//        System.out.println("classTwoInherited protected field by classTwo = " + classTwoInherited.fieldProtectedClassTwo);   // not allowed here (different package)
        System.out.println("classTwoInherited public field by classTwo = " + classTwoInherited.fieldPublicClassTwo);
//        System.out.println("classTwoInherited private field by classTwo = " + classTwoInherited.fieldPrivateClassTwo);       // not allowed here


        ClassTwoInheritedThisPackage classTwoInheritedThisPackage = new ClassTwoInheritedThisPackage();
//        System.out.println("classTwoInheritedThisPackage default field by classTwo = " + classTwoInheritedThisPackage.fieldDafaultClassTwo);        // not allowed here (different package)
        System.out.println("classTwoInheritedThisPackage public field by classTwo = " + classTwoInheritedThisPackage.fieldPublicClassTwo);
//        System.out.println("classTwoInheritedThisPackage private field by classTwo = " + classTwoInheritedThisPackage.fieldPrivateClassTwo);       // not allowed here
//        System.out.println("classTwoInheritedThisPackage protected field by classTwo = " + classTwoInheritedThisPackage.fieldProtectedClassTwo);   // not allowed here
        System.out.println("classTwoInheritedThisPackage.getParentProtectedField() = " + classTwoInheritedThisPackage.getParentProtectedField());
        System.out.println("classTwoInheritedThisPackage.getParentDefaultField() = " + classTwoInheritedThisPackage.getParentDefaultField());
    }

}
