package priscille.pglp_3_3;
import java.util.ArrayList;

public class AllRobot {
    /**
     * Liste de robots.
     */
    protected ArrayList<Robot> liste;
    /**
     * Constructeur.
     */
    public AllRobot() {
        liste = new ArrayList<Robot>();
    }
    /**
     * Getter de la liste.
     * @return La liste de robots
     */
    @SuppressWarnings("unchecked")
    public ArrayList<Robot> getList() {
        return (ArrayList<Robot>) liste.clone();
    }
    /**
     * Ajout d'un robot dans la liste.
     * @param r Le robot a ajouter
     */
    public void add(final Robot r) {
        if (!liste.contains(r)) {
            liste.add(r);
        }
    }
    /**
     * Fonction faisant avancer les robots de la liste.
     */
    public void avancerTous() {
        for (Robot robot : liste) {
            robot.avance();
        }
    }
}
