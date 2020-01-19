package com.mainacad.packageFour;

import com.mainacad.packageThree.ClassTwoInherited;

public class ApplicationStarterPackageFour {
    public static void main(String[] args) {
        ClassTwoPackageFour classTwoPackageFour = new ClassTwoPackageFour();
        System.out.println("classTwoPackageFour default field by classTwo = " + classTwoPackageFour.fieldDafaultClassTwo);
        System.out.println("classTwoPackageFour protected field by classTwo = " + classTwoPackageFour.fieldProtectedClassTwo);
        System.out.println("classTwoPackageFour public field by classTwo = " + classTwoPackageFour.fieldPublicClassTwo);
//        System.out.println("classTwoPackageFour private field by classTwo = " + classTwoPackageFour.fieldPrivateClassTwo);       // not allowed here


        System.out.println("classTwoPackageFour default method by classTwo = " + classTwoPackageFour.methodDafaultClassTwo());
        System.out.println("classTwoPackageFour protected method by classTwo = " + classTwoPackageFour.methodProtectedClassTwo());
        System.out.println("classTwoPackageFourpublic method by classTwo = " + classTwoPackageFour.methodPublicClassTwo());
//        System.out.println("classTwoPackageFourprivate method by classTwo = " + classTwoPackageFour.methodPrivateClassTwo());       // not allowed here

}
}
