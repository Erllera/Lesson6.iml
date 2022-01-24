package com.company;

public class GameEntity {
    private int Health;
    private int Damage;

    public GameEntity(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
}
