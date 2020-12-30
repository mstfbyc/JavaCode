package com.bilgeadam.tutorials.program_flow.operators;

public class LogicalOperators {
    private static void LogicalAnd(boolean first, boolean last){
        System.out.println("LogicalOperators.LogicalAnd");
        System.out.println(first + " && " + last + " is " + (first && last));
    }

    private static void LogicalOr(boolean x, boolean y){
        System.out.println("LogicalOperators.LogicalOr");
        System.out.println(x + " || " + y + " is " + (x || y));
    }

    private static void LogicalNot(boolean input){
        System.out.println("LogicalOperators.LogicalNot");
        System.out.println("!" + input  + " is " + (!input));
    }

    public static void main(String[] args) {
        LogicalAnd(3 < 4, 3 > 4);
        LogicalOr(4 >= 4, 3 > 32);
        LogicalNot(!false);
    }
}
