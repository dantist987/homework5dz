package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(150);
        boss.setDefenceType("Hero.");

        System.out.println("Boss health is " + boss.getHealth() + ". Boss damage is " + boss.getDamage() + ". Boss defence type is " + boss.getDefenceType());
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            String agility;
            if (hero.getSuperAgility() == null) {
                agility = ". No Super Agility.";
            } else {
                agility = ". Super Agility is " + hero.getSuperAgility();
            }
            System.out.println("Hero's " + "Health is " + hero.getHealth() + ". Damage is " + hero.getDamage() + agility);
        }
    }

    public static Hero[] createHeroes() {
        Hero Strength = new Hero(400, 60, "Physical.");
        Hero Magical = new Hero(300, 50);
        Hero Archer = new Hero(200, 40, "Long Range Shot.");

        return new Hero[]{Strength, Magical, Archer};
    }


}
