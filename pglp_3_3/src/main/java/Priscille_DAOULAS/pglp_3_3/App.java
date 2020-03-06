package Priscille_DAOULAS.pglp_3_3;

import java.util.ArrayList;

/**
 * Classe App 
 */
public final class App {
	/**
	 * constructeur de la classe App.
	 */
	private App() {
	}
	/**
	 * Utilisation des différentes fonctions.
	 * @param args Les arguments donnés au démarrage
	 */
    public static void main(final String[] args) {
    	ArrayList<Robot> listeRb = new ArrayList<Robot>();
        listeRb.add(new RobotType1());
        listeRb.add(new RobotType2(12));
        allRobot.avancerTous(listeRb);
        for (Robot robot : listeRb) {
			System.out.println(robot.position.toString());
		}
    }
}
