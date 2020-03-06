package Priscille_DAOULAS.pglp_3_3;
/**
 * Classe Position pour définir la position d'un robot.
 *
 */
public class Position {
	/**
	 * Valeur en abscisse.
	 */
	public int x;
	/**
	 * Valeur en ordonnée.
	 */
	public int y;
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
}
