package priscille.pglp_3_3;
/**
 * Classe Position pour définir la position d'un robot.
 *
 */
public class Position {
    /**
     * Valeur en abscisse.
     */
    private int x;
    /**
     * Valeur en ordonnée.
     */
    private int y;
    /**
     * Constructeur par défaut.
     */
    public Position() {
        x = 0;
        y = 0;
    }
    /**
     * Constructeur.
     * @param absc Valeur en abscisse de la position
     * @param ord Valeur en ordonnée de la position
     */
    public Position(final int absc, final int ord) {
        this.x = absc;
        this.y = ord;
    }
    /**
     * Description de la position du robot.
     * @return La position en abscisse et ordonnée du robot
     */
    public String toString() {
        return "Position : (" + x + "," + y + ")";
    }
    /**
     * Getter de x.
     * @return La position en x
     */
    public int getX() {
        return x;
    }
    /**
     * Getter de y.
     * @return La position en y
     */
    public int getY() {
        return y;
    }
    /**
     * Setter de x.
     * @param a La nouvelle valeur de x
     */
    public void setX(final int a) {
        this.x = a;
    }
    /**
     * Setter de x.
     * @param a La nouvelle valeur de y
     */
    public void setY(final int a) {
        this.y = a;
    }
}
