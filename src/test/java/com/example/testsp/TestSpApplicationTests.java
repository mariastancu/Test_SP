package com.example.testsp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestSpApplicationTests {
	@Test
	void testBattalionAttacks(){

		CreatureFactory factory = new CreatureFactory();
		Creature gnome = factory.createCreature("gnome");
		Creature elf = factory.createCreature("elf");
		Creature ent = factory.createCreature("ent");


		Battalion battalion = new Battalion();
		battalion.addCreature(gnome);
		battalion.addCreature(elf);
		battalion.addCreature(ent);


		assertNotNull(battalion);
		battalion.attack();

	}

	@Test
	void testBattalionDefends() {

		CreatureFactory factory = new CreatureFactory();
		Creature gnome = factory.createCreature("gnome");
		Creature elf = factory.createCreature("elf");
		Creature ent = factory.createCreature("ent");


		Battalion battalion = new Battalion();
		battalion.addCreature(gnome);
		battalion.addCreature(elf);
		battalion.addCreature(ent);


		assertNotNull(battalion);
		battalion.defend();

	}
}
