package com.bilgeadam.tutorials.access_modifiers.trials;

public class ClassPackageTests {
    static PublicClass myFieldOne;
    static ProtectedClass myFieldTwo;

    public static void main(String[] args) {
        // Initialize
        myFieldOne = new PublicClass();
        myFieldTwo = new ProtectedClass();

        myFieldOne.myPublicMethod();
        myFieldOne.myProtectedMethod();

        System.out.println("myFieldOne = " + myFieldOne.myPublicString);
        System.out.println("myFieldOne = " + myFieldOne.myProtectedString);

        myFieldTwo.myPublicMethod();
        myFieldTwo.myProtectedMethod();

        System.out.println("myFieldTwo = " + myFieldTwo.myPublicString);
        System.out.println("myFieldTwo = " + myFieldTwo.myProtectedString);
    }
}
