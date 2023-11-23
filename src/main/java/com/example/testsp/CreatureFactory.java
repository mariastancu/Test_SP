package com.example.testsp;

public class CreatureFactory {
    public Creature createCreature(String type) {
        if (type.equalsIgnoreCase("gnome")) {
            return new Gnome();
        } else if (type.equalsIgnoreCase("elf")) {
            return new Elf();
        } else if (type.equalsIgnoreCase("ent")) {
            return new Ent();
        }
        return null;
    }
}
