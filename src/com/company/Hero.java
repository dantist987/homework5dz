package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superAgility;

    public Hero(int health, int damage, String superAgility) {
        this.health = health;
        this.damage = damage;
        this.superAgility = superAgility;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAgility() {
        return superAgility;
    }
}
