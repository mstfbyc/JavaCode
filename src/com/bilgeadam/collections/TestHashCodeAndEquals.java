package com.bilgeadam.collections;

import java.util.*;

class Player{
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim :" + name + " |||";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
public class TestHashCodeAndEquals {

    public static void main(String[] args) {
        Set<Player> playerList = new HashSet<>();
        Player player1 = new Player("Mustafa",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1);

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);

        for (Player p: playerList) {
            System.out.println(p);

        }
    }
}

