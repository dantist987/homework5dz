package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(150);
        boss.setDefenceType("Hero.");

        System.out.println("Boss health is " + boss.getHealth() + ". Boss damage is " + boss.getDamage() + ". Boss defence type is " + boss.getDefenceType());
    }
}
