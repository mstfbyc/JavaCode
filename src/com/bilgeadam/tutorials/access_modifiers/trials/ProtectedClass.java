package com.bilgeadam.tutorials.access_modifiers.trials;

class ProtectedClass {
    public String myPublicString = "This is public string";

    protected String myProtectedString = "This is protected string";

    private String myPrivateString = "This is private string";

    public void myPublicMethod(){
        System.out.println("ProtectedClass.myPublicMethod");
    }

    protected void myProtectedMethod(){
        System.out.println("ProtectedClass.myProtectedMethod");
    }

    private void myPrivateMethod(){
        System.out.println("ProtectedClass.myPrivateMethod");
    }
}
