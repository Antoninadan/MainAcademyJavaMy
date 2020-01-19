package com.mainacad.packageTwo;

import com.mainacad.packageThree.ClassTwoInherited;

public class ApplicationStarterPackageTwo {
    public static void main(String[] args) {
        ClassTwoInherited classTwoInherited = new ClassTwoInherited();
//        System.out.println("classTwoInherited default field by classTwo = " + classTwoInherited.fieldDafaultClassTwo);        // not allowed here
        System.out.println("classTwoInherited protected field by classTwo = " + classTwoInherited.fieldProtectedClassTwo);
        System.out.println("classTwoInherited public field by classTwo = " + classTwoInherited.fieldPublicClassTwo);
//        System.out.println("classTwoInherited private field by classTwo = " + classTwoInherited.fieldPrivateClassTwo);       // not allowed here


//        System.out.println("classTwoInherited default method by classTwo = " + classTwoInherited.methodDafaultClassTwo());        // not allowed here
        System.out.println("classTwoInherited protected method by classTwo = " + classTwoInherited.methodProtectedClassTwo());
        System.out.println("classTwoInherited public method by classTwo = " + classTwoInherited.methodPublicClassTwo());
//        System.out.println("classTwoInherited private method by classTwo = " + classTwoInherited.methodPrivateClassTwo());       // not allowed here

}
}
