package Priscille_DAOULAS.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe RobotType2.
 */
public class RobotType2Test {
	@Test
	/**
	 * Test du constructeur.
	 */
	public void test() {
		Robot r = new RobotType2(4);
		assertTrue(r.getPosition().x == 0 && r.getPosition().y == 0);
	}
	@Test
	/**
	 * Test de l'avancement.
	 */
	public void testAvance() {
		Robot r = new RobotType2(15);
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().x == 15 && r.getPosition().y == 0);
	}
}