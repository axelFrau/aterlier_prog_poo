package aterlier2.exercice_1;
import java.util.*;
public class De {

    /**
     * @param r Random
     * @param nbrFace int
     * @param nom0 String
     * @param cpt int
     */
    public static Random r = new Random();
    protected int nbrFace;
    protected String nom;
    protected static int cpt = 0;

    /**
     * Constructor for the dice with attributes
     * @param nbrFace int
     * @param nom String
     */
    public De(int nbrFace, String nom) {
        this.cpt ++;
        setNbrFace(nbrFace);
        setNom(nom);
    }

    /**
     * Constructor for the default dice without attributes
     */
    public De() {
        this.cpt ++;
        setNbrFace(6);
        setNom(null);
    }

    /**
     * Setter and Getter for the number of side of the dice
     * @param nbrFace int
     */
    public void setNbrFace(int nbrFace){
        if (3 <= nbrFace && nbrFace <= 120) {
            this.nbrFace = nbrFace;
        } else {
            System.out.println("Nombre de faces invalide");
        }
    }
    public int getNbrFace(){
        return this.nbrFace;
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
     * Getter for the number of dice created
     * @return
     */
    public static int getCpt(){
        return cpt;
    }
    /**
     *
     * @return int
     */
    public int lancer(){
        return r.nextInt(this.nbrFace) + 1;
    }

    public int lancer(int nbrLancer){
        int resLancer = -1;
        int res = 0;
        do {
            int tempo = resLancer;
            resLancer = lancer();
            System.out.println(resLancer);
            if (resLancer >= res) {
                res = resLancer;
            }
            nbrLancer -= 1;
        } while (nbrLancer != 0);
        return res;
    }

    @Override
    public String toString() {
        return String.format("Nom du dé : " + this.nom +"\nNbr de faces : "+ this.nbrFace + "\n#########################");
    }

    public boolean equals(Object obj) {
        boolean res = false;
        if (obj == null || getClass() != obj.getClass()) {
            res = false;
        } else {
            if (this == obj) res = true;
            De de = (De) obj;
            if (this.getNom() == de.nom && this.getNbrFace() == de.nbrFace){
                res = true;
            }
        }
        return res;
    }
}