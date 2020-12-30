package com.bilgeadam.tutorials.access_modifiers.trials;

public class PublicClass {
    public String myPublicString = "This is public string";

    protected String myProtectedString = "This is protected string";

    private String myPrivateString = "This is private string";

    public void myPublicMethod(){
        System.out.println("PublicClass.myPublicMethod");
    }

    protected void myProtectedMethod(){
        System.out.println("PublicClass.myProtectedMethod");
    }

    private void myPrivateMethod(){
        System.out.println("PublicClass.myPrivateMethod");
    }
}
