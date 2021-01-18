package com.bilgeadam.collections;

import java.util.*;

class Friend implements Comparable<Friend>{
    private String name;
    private int id;

    public Friend(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Friend o) {
/*         if(this.id < o.id){
             return -1;
         }else if(this.id > o.id){
             return 1;
         }
       return 0;*/
        return  this.name.compareTo(o.getName());

    }
}

public class TestSort {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("C++");
        stringList.add("Go");
        stringList.add("Javascript");
        stringList.add("Php");
        stringList.add("C#");
        Collections.sort(stringList);

        for (String s:stringList) {
            System.out.println(s);

        }

        Friend friend1 =new Friend("Mustafa",1);
        Friend friend2 =new Friend("Mehmet",2);
        Friend friend3 =new Friend("Ahmet",3);
        Friend friend4 =new Friend("Nihat",4);
        Friend friend5 =new Friend("Burhan",5);
        Friend friend6 =new Friend("Zeynep",6);
        Friend friend7 =new Friend("Zuhal",7);
        List<Friend> friendList = new ArrayList<>(Arrays.asList(friend1,friend2,friend3,friend4,friend5,friend6,friend7));
        Collections.sort(friendList);

        for (Friend f:friendList) {
            System.out.println(f);

        }
    }

}