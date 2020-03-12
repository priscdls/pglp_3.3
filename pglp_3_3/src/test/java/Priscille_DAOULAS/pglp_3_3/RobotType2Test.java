package Priscille_DAOULAS.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe RobotType2.
 */
public class RobotType2Test {
	/**
	 * Test du constructeur.
	 */
	@Test
	public void test() {
		Robot r = new RobotType2(4);
		assertTrue(r.getPosition().getX() == 0 && r.getPosition().getY() == 0);
	}
	/**
	 * Test de l'avancement.
	 */
	@Test
	public void testAvance() {
		Robot r = new RobotType2(15);
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().getX() == 15 && r.getPosition().getY() == 0);
	}
}
