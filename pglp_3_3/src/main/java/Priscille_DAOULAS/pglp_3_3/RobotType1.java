package Priscille_DAOULAS.pglp_3_3;
/**
 * Classe RobotType1 héritant de la classe Robot.
 */
public class RobotType1 extends Robot {
    /**
     * Avancement du robot.
     */
    private final int av = 5;
    /**
     * Fonction d'avancement du robot.
     * Les robots de type 1 avancent de 5 cases.
     */
    public void avance() {
        if (direction == Direction.Nord) {
            position.setY(position.getY() + av);
        } else if (direction == Direction.Sud) {
            position.setY(position.getY() - av);
        } else if (direction == Direction.Ouest) {
            position.setX(position.getX() - av);
        } else if (direction == Direction.Est) {
            position.setX(position.getX() + av);
        }
    }
}
