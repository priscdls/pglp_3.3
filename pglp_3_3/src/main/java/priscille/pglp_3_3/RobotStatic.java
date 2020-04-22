package priscille.pglp_3_3;
/**
 * Classe RobotStatic.
 */
public class RobotStatic {
    /**
     * Position du robot statique.
     */
    private Position position;
    /**
     * Getter position.
     * @return La position du robot
     */
    public Position getPosition() {
        return new Position(position.getX(), position.getY());
    }
    /**
     * Constructeur.
     * @param pos La position du robot
     */
    public RobotStatic(final Position pos) {
        position = pos;
        }
}
