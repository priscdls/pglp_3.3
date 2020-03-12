package Priscille_DAOULAS.pglp_3_3;
/**
 * Classe abstraite Robot.
 */
public abstract class Robot {
    /**
     * Position du robot.
     */
    protected Position position;
    /**
     * La direction d'avancement du robot.
     */
    protected Direction direction;
    /**
     * Constructeur par défaut.
     */
    public Robot() {
        position = new Position();
        direction = Direction.Nord;
    }
    /**
     * Constructeur.
     * @param p La position du robot
     * @param d La direction du robot
     */
    public Robot(final Position p, final Direction d) {
        position = p;
        direction = d;
    }
    /**
     * Fonction d'avancement du robot.
     */
    public abstract void avance();
    /**
     * Fonction qui tourne le robot en changeant sa direction.
     */
    public void tourne() {
        if (direction == Direction.Sud) {
            direction = Direction.Ouest;
        } else if (direction == Direction.Ouest) {
            direction = Direction.Nord;
        } else if (direction == Direction.Est) {
            direction = Direction.Sud;
        } else if (direction == Direction.Nord) {
            direction = Direction.Est;
        }
    }
    /**
     * Fonction qui permet de récupérer la position du robot.
     * @return La position du robot
     */
    public Position getPosition() {
        return new Position(position.getX(), position.getY());
    }
}
