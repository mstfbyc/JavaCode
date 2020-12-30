package com.bilgeadam.tutorials.access_modifiers;

import com.bilgeadam.tutorials.access_modifiers.trials.PublicClass;

public class ClassTests {
    static int x;
    static PublicClass myField;
    //static ProtectedClass myFieldTwo; // Cannot access protected class.

    public static void main(String[] args) {
        // Initialize fields
        myField = new PublicClass(); // Similar to arrays.

        myField.myPublicMethod();

        System.out.println("myField = " + myField.myPublicString);
    }
}
