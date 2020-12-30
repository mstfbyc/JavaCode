package com.bilgeadam.tutorials.program_flow.operators;

public class AssignmentOperators {

    private static void AddAndAssign(int x, int y){
        int input = x;
        System.out.println("AssignmentOperators.AddAndAssign");
        x += y; // x = x + y;
        System.out.println(input + " += " + y + " is " + x);
    }

    private static void SubtractAndAssign(float x, int y){
        float input = x;
        System.out.println("AssignmentOperators.SubtractAndAssign");
        x -= y; // x = x - y;
        System.out.println(input + " -= " + y + " is " + x);
    }

    private static void MultiplyAndAssign(long x, float y){
        long input = x;
        System.out.println("AssignmentOperators.MultiplyAndAssign");
        x *= y; // x = x * y
        System.out.println(input + " *= " + y + " is " + x);
    }

    private static void DivideAndAssign(byte x, float y){
        byte input = x;
        System.out.println("AssignmentOperators.DivideAndAssign");
        x /= y; // x = x / y;
        System.out.println(input + " /= " + y + " is " + x);
    }

    private static void ModulusAndAssign(long x, int y){
        long input = x;
        System.out.println("AssignmentOperators.ModulusAndAssign");
        x %= y; // x = x % y;
        System.out.println(input + " %= " + y + " is " + x);
    }

    public static void main(String[] args) {
        AddAndAssign(4, -2);
        SubtractAndAssign(34.8F, 100);
        MultiplyAndAssign(3L, 45.1F);
        DivideAndAssign((byte) 12, 0.1F);
        DivideAndAssign(Byte.MAX_VALUE, 0.1F);
        ModulusAndAssign(4_587_349_864_123_567_433L, 145_123_456);
    }
}
