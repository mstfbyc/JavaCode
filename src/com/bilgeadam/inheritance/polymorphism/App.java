package com.bilgeadam.inheritance.polymorphism;

class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String talk(){
        return getName() + " Hayvan konuşuyor.";
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return getName()+" miyavladı";
    }
}
class Dog extends  Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return getName()+ " havladı";
    }
}
class Hourse extends Animal{
    public Hourse(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return getName()+" Kişnedi";
    }
}
public class App {

    public static void main(String[] args) {
    /*    Cat cat = new Cat("Tekir");
        System.out.println(cat.talk());*/
        Animal animal = new Cat("Tekir");
        //System.out.println(animal.talk());
        Animal animal2 = new Hourse("Turbo");
        Object object = new Cat(" Pamuk");
        //System.out.println(animal2.talk());
/*
        if(animal instanceof Cat){
            System.out.println("Bu bir kedi");
        }else if(animal instanceof Dog){
            System.out.println("Bu bir köpek." );
        }else if(animal instanceof Hourse){
            System.out.println("Bu bir at.");
        }*/
        if(object instanceof Cat){
            Cat cat = (Cat) object;
            talker(cat);
        }

    }
    public static void talker(Animal animal){
        System.out.println(animal.talk());
    }
}

