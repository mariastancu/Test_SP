package com.example.testsp;

import java.util.ArrayList;
import java.util.List;

public class Battalion implements Creature{

    private List<Creature> creatures;

    public Battalion() {
        this.creatures = new ArrayList<>();
    }

    public void addCreature(Creature creature) {
        creatures.add(creature);
    }

    public void removeCreature(Creature creature) {
        creatures.remove(creature);
    }

    @Override
    public void attack() {
        for (Creature creature : creatures) {
            creature.attack();
        }
    }

    @Override
    public void defend() {
        for (Creature creature : creatures) {
            creature.defend();
        }
    }
}
