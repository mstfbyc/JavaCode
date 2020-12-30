package com.bilgeadam.examples.operations;

public class MathematicalOperationsTests {
    static Long result;  // Default null
    static int x, y;     // Default '0'
    static Float resultDivision;

    public static void additionTests(){
        System.out.println("additionTests");
        // First test
        x = 3;
        y = 5;
        result = MathematicalOperations.addition(x, y);
        System.out.println(x + " + " + y + " = " + result);

        // Second test
        x = -3;
        y = -5;
        result = MathematicalOperations.addition(x, y);
        System.out.println(x + " + " + y + " = " + result);

        // Third test
        x = 0;
        y = 10_000_000;
        result = MathematicalOperations.addition(x, y);
        System.out.println(x + " + " + y + " = " + result);

        // Forth test
        x = 2_147_483_647;
        y = 2_147_483_647;
        result = MathematicalOperations.addition(x, y);
        System.out.println(x + " + " + y + " = " + result);
    }

    public static void subtractionTests(){
        System.out.println("subtractionTests");
        // First test
        x = 3;
        y = 5;
        result = MathematicalOperations.subtraction(x, y);
        System.out.println(x + " - " + y + " = " + result);

        // Second test
        x = -3;
        y = -5;
        result = MathematicalOperations.subtraction(x, y);
        System.out.println(x + " - " + y + " = " + result);

        // Third test
        x = -2_147_483_648;
        y = 1;
        result = MathematicalOperations.subtraction(x, y);
        System.out.println(x + " - " + y + " = " + result);

        // Forth test
        x = 2_147_483_647;
        y = -2_147_483_648;
        result = MathematicalOperations.subtraction(x, y);
        System.out.println(x + " - " + y + " = " + result);
    }

    public static void multiplicationTests(){
        System.out.println("multiplicationTests");

        // First test
        x = Integer.MAX_VALUE;
        y = Integer.MAX_VALUE;
        result = MathematicalOperations.multiplication(x, y);
        System.out.println(x + " * " + y + " = " + result);

        // Second test
        x = Integer.MIN_VALUE;
        y = Integer.MIN_VALUE;
        result = MathematicalOperations.multiplication(x, y);
        System.out.println(x + " * " + y + " = " + result);

        // Third test
        x = Integer.MAX_VALUE;
        y = Integer.MIN_VALUE;
        result = MathematicalOperations.multiplication(x, y);
        System.out.println(x + " * " + y + " = " + result);

        // Forth test
        x = Integer.MAX_VALUE;
        y = 0;
        result = MathematicalOperations.multiplication(x, y);
        System.out.println(x + " * " + y + " = " + result);

        // Fifth test
        x = Integer.MIN_VALUE;
        y = 0;
        result = MathematicalOperations.multiplication(x, y);
        System.out.println(x + " * " + y + " = " + result);

        // Sixth test
        x = 3;
        y = 10;
        result = MathematicalOperations.multiplication(x, y);
        System.out.println(x + " * " + y + " = " + result);
    }

    public static void divisionTests(){
        System.out.println("divisionTests");

        // First test
        x = 10;
        y = 5;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);

        // Second test
        x = 0;
        y = 5;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);

        // Third test
        x = -5;
        y = 0;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);

        // Forth test
        x = 5;
        y = 0;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);

        // Fifth test
        x = 0;
        y = 0;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);

        // Sixth test
        x = 155_155_222;
        y = 1000;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);

        // Seventh test
        x = 10;
        y = 3;
        resultDivision = MathematicalOperations.division(x, y);
        System.out.println(x + " / " + y + " = " + resultDivision);
    }

    public static void main(String[] args) {
        additionTests();
        subtractionTests();
        multiplicationTests();
        divisionTests();
    }
}
