package Priscille_DAOULAS.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe RobotStatic.
 */
public class RobotStaticTest {

	@Test
	/**
	 * Test du constructeur.
	 */
	public void test() {
		Position p = new Position(1,5);
		RobotStatic rs = new RobotStatic(p);
	}
}
