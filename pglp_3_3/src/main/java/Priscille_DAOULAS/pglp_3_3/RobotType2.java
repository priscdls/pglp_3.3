package Priscille_DAOULAS.pglp_3_3;
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
	@Override
	/**
	 * Fonction d'avancement du robot.
	 * Les robots de types 2 avancent selon leur vitesse.
	 */
	public void avance() {
		if (direction == Direction.Nord) {
			position.y += vitesse;
		}
		else if (direction == Direction.Sud) {
			position.y -= vitesse;
		}
		else if (direction == Direction.Ouest) {
			position.x -= vitesse;
		}
		else if (direction == Direction.Est) {
			position.x += vitesse;
		}
	}
}

