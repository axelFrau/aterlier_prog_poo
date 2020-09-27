package aterlier2.exercice2;
import java.util.*;

public class EntierFou extends Entier{

    public static Random r = new Random();
    private int niveauDeFolie;

    /**
     * Constructor for EntierFou
     * @param valeur - int
     * @param borneInf - int
     * @param borneSup - int
     * @param niveauDeFolie - int
     */
    public EntierFou(int valeur, int borneInf,int borneSup,int niveauDeFolie) {
        super(valeur, borneInf, borneSup);
        this.niveauDeFolie = niveauDeFolie;
    }

    /**
     * Constructor for EntierFou without value
     * @param borneInf - int
     * @param borneSup - int
     * @param niveauDeFolie - int
     */
    public EntierFou(int borneInf,int borneSup,int niveauDeFolie) {
        super(borneInf, borneSup);
        this.niveauDeFolie = niveauDeFolie;
    }

    public int getNiveauDeFolie() {
        return this.niveauDeFolie;
    }

    /**
     * increment EntierFou by a random amount based on the amount of "Folie"
     */
    @Override
    public void incremente(){
        int random = r.nextInt(this.niveauDeFolie + 1) + 0;
        super.incremente(random);
    }

    /**
     * Return the info of the object
     * @return String
     */
    @Override
    public String toString() {
        return "Valeur : "+ this.valeur + "\nBornes : " + this.borneInf +" et " + this.borneSup;
    }

    /**
     * Override of equals for Entier Object
     * @param obj - Object
     * @return Boolean
     */
    @Override
    public boolean equals(Object obj) {
        boolean res = false;
        if (obj == null || getClass() != obj.getClass()) {
            res = false;
        } else {
            ArrayList<Integer> bornes = this.getBornes();
            if (this == obj) res = true;
            EntierFou entier = (EntierFou) obj;
            if (bornes.get(0) == entier.getBorneInf() && bornes.get(1) == entier.getBorneSup() && this.niveauDeFolie == entier.getNiveauDeFolie() && this.valeur == entier.getValeur()){
                res = true;
            }
        }
        return res;
    }

}
