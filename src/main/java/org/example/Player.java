package org.example;

public class Player {

    public int id;
    public String name;
    public int strength;

    public Player(int id, String name ,int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}
