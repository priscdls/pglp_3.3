package Priscille_DAOULAS.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe RobotType1.
 */
public class RobotType1Test {
	@Test
	/**
	 * Test du constructeur.
	 */
	public void test() {
		Robot r = new RobotType1();
		assertTrue(r.getPosition().x == r.getPosition().y && r.getPosition().y == 0);
	}
	
	@Test
	/**
	 * Test de l'avancement.
	 */
	public void testAvancement() {
		Robot r = new RobotType1();
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().x == 5 && r.getPosition().y == 0);
	}
}
