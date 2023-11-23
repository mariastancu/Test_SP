package com.example.testsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestSpApplication {
	public static void main(String[] args) {

		// Create instances of different creatures using the factory
		CreatureFactory factory = new CreatureFactory();
		Creature gnome1 = factory.createCreature("gnome");
		Creature gnome2 = factory.createCreature("gnome");
		Creature elf1 = factory.createCreature("elf");
		Creature elf2 = factory.createCreature("elf");
		Creature ent1 = factory.createCreature("ent");
		Creature ent2 = factory.createCreature("ent");

		// Create battalions and add creatures to them
		Battalion battalion1 = new Battalion();
		battalion1.addCreature(gnome1);
		battalion1.addCreature(elf1);

		Battalion battalion2 = new Battalion();
		battalion2.addCreature(gnome2);
		battalion2.addCreature(ent1);
		battalion2.addCreature(ent2);

		// Initiate attacks and defense maneuvers
		System.out.println("Battalion 1 attacks:");
		battalion1.attack();

		System.out.println("\nBattalion 2 defends:");
		battalion2.defend();
	}

}
