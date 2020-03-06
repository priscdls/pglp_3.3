package Priscille_DAOULAS.pglp_3_3;

import java.util.ArrayList;

public class allRobot {
	/**
	 * Fonction faisant avancer les robots de la liste.
	 * @param liste La liste des robots qui avancent
	 */
	public static void avancerTous(final ArrayList<Robot> liste) {
		for (Robot robot : liste) {
			robot.avance();
		}
	}
}
