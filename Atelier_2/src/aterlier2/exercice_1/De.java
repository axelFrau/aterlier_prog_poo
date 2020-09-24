package aterlier2.exercice_1;
import java.util.*;
public class De {

    /**
     * @param r Random
     * @param nbr_face int
     * @param nom0 String
     * @param cpt int
     */
    public static Random r = new Random();
    protected int nbr_face;
    protected String nom;
    private static int cpt = 0;

    /**
     * Constructor for the dice with attributes
     * @param nbr_face int
     * @param nom String
     */
    public De(int nbr_face, String nom) {
        this.cpt ++;
        setNbr_face(nbr_face);
        setNom(nom);
    }

    /**
     * Constructor for the default dice without attributes
     */
    public De() {
        this.cpt ++;
        setNbr_face(6);
        setNom(null);
    }

    /**
     * Setter and Getter for the number of side of the dice
     * @param nbr_face int
     */
    public void setNbr_face(int nbr_face){
        if (3 <= nbr_face && nbr_face <= 120) {
            this.nbr_face = nbr_face;
        } else {
            System.out.println("Nombre de faces invalide");
        }
    }
    public int getNbr_face(){
        return this.nbr_face;
    }

    /**
     * Setter and Getter for the dice name
     * @param nom String
     */
    private void setNom(String nom){
        if (nom != "" && nom != null){
            this.nom = nom;
        } else {
            this.nom = "Dé n°"+this.cpt;
        }
    }
    public String getNom(){
        return this.nom;
    }

    /**
     *
     * @return int
     */
    public int lancer(){
        return r.nextInt(this.nbr_face) + 1;
    }

    public int lancer(int nbr_lancer){
        int res_lancer = -1;
        int res = 0;
        do {
            int tempo = res_lancer;
            res_lancer = lancer();
            System.out.println(res_lancer);
            if (res_lancer >= res) {
                res = res_lancer;
            }
            nbr_lancer -= 1;
        } while (nbr_lancer != 0);
        return res;
    }

    @Override
    public String toString() {
        return String.format("Nom du dé : " + this.nom +"\nNbr de faces : "+ this.nbr_face + "\n#########################");
    }

    public boolean equals(Object obj) {
        boolean res = false;
        if (obj == null || getClass() != obj.getClass()) {
            res = false;
        } else {
            if (this == obj) res = true;
            De de = (De) obj;
            if (this.getNom() == de.nom && this.getNbr_face() == de.nbr_face){
                res = true;
            }
        }
        return res;
    }
}