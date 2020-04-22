package priscille.pglp_3_3;

/**
 * Classe App.
 */
public final class App {
    /**
     * Constructeur de la classe App.
     */
    private App() {
    }
    /**
     * Utilisation des différentes fonctions.
     * @param args Les arguments donnés au démarrage
     */
    public static void main(final String[] args) {
        final int vitesse = 12;
        AllRobot rbs = new AllRobot();
        rbs.add(new RobotType1());
        rbs.add(new RobotType2(vitesse));
        rbs.avancerTous();
        for (Robot robot : rbs.liste) {
            System.out.println(robot.position.toString());
        }
    }
}
