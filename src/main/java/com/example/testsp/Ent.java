package com.example.testsp;

public class Ent implements Creature{
    @Override
    public void attack() {
        System.out.println("Ent attacks with immense strength and tree branches!");
    }

    @Override
    public void defend() {
        System.out.println("Ent defends by rooting and hardening its bark!");
    }
}
