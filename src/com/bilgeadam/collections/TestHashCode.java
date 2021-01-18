package com.bilgeadam.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Players{
    private String name;
    private int id;

    public Players(String name, int id) {
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
        return "Players{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players)) return false;
        Players players = (Players) o;
        return getId() == players.getId() && Objects.equals(getName(), players.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}
public class TestHashCode {

    public static void main(String[] args) {
        Players players1 = new Players("Mustafa", 1);
        Players players2 = new Players("Mehmet", 2);
        Players players3 = new Players("Ahmet", 3);
        Players players4 = new Players("Ayfer", 4);
        Players players5 = new Players("Zeynep", 5);
        Players players6 = new Players("Mustafa", 1);

        Set<String> hashSet1 = new HashSet<>();
        Set<Players> hashSet2 = new HashSet<>();
        hashSet1.add("Java");
        hashSet1.add("C++");
        hashSet1.add("Go");
        hashSet1.add("Java");
        hashSet2.addAll(Arrays.asList(players1,players2,players3,players4,players5,players6));
        System.out.println(hashSet1);
        System.out.println(hashSet2);
    }

}
