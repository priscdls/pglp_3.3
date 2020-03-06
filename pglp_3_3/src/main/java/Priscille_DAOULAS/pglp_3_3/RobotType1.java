package Priscille_DAOULAS.pglp_3_3;
/**
 * Classe RobotType1 héritant de la classe Robot.
 */
public class RobotType1 extends Robot{
	/**
	 * Fonction d'avancement du robot.
	 * Les robots de type 1 avancent de 5 cases.
	 */
	public void avance() {
		if (direction == Direction.Nord) {
			position.y += 5;
		}
		else if (direction == Direction.Sud) {
			position.y -= 5;
		}
		else if (direction == Direction.Ouest) {
			position.x -= 5;
		}
		else if (direction == Direction.Est) {
			position.x += 5;
		}
	}
}
