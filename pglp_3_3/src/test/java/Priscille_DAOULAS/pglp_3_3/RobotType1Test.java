package Priscille_DAOULAS.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe RobotType1.
 */
public class RobotType1Test {
	/**
	 * Test du constructeur.
	 */
	@Test
	public void test() {
		Robot r = new RobotType1();
		assertTrue(r.getPosition().getX() == r.getPosition().getY() && r.getPosition().getY() == 0);
	}
	
	/**
	 * Test de l'avancement.
	 */
	@Test
	public void testAvancement() {
		Robot r = new RobotType1();
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().getX() == 5 && r.getPosition().getY() == 0);
	}
}
