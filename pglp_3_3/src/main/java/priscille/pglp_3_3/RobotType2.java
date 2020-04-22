package priscille.pglp_3_3;
/**
 * Classe RobotType2 héritant de la classe Robot.
 */
public class RobotType2 extends Robot {
    /**
     * La vitesse d'avancement du robot.
     */
    private final int vitesse;
    /**
     * Constructeur.
     * @param v La vitesse d'avancement du robot
     */
    public RobotType2(final int v) {
        super();
        this.vitesse = v;
    }
    /**
     * Fonction d'avancement du robot.
     * Les robots de types 2 avancent selon leur vitesse.
     */
    @Override
    public void avance() {
        if (direction == Direction.Nord) {
            position.setY(position.getY() + vitesse);
        } else if (direction == Direction.Sud) {
            position.setY(position.getY() - vitesse);
        } else if (direction == Direction.Ouest) {
            position.setX(position.getX() - vitesse);
        } else if (direction == Direction.Est) {
            position.setX(position.getX() + vitesse);
        }
    }
}

