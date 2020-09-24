package aterlier2.exercice_1;

public class De_pipe extends De{
    private int borne_minimal;

    /**
     * Constructor for de_pipe object
     * @param nbr_face int
     * @param nom String
     * @param borne_minimale int
     */
    public De_pipe(int nbr_face, String nom, int borne_minimale){
        super(nbr_face,nom);
        setBorne_minimal(borne_minimale);
    }

    /**
     *Setter for borne_minimal
     * @param borne_minimal int
     */
    public void setBorne_minimal(int borne_minimal){
        if (this.nbr_face < borne_minimal) {
            this.borne_minimal = nbr_face;
        } else {
            this.borne_minimal = borne_minimal;
        }

    }

    /**
     * Getter for the borne_minimal
     * @return int
     */
    public int getBorne_minimal(){
        return borne_minimal;
    }

    /**
     * Lance le dé pipé et renvoie un chiffre entre la borne fixé et le nbr de face
     * @return int
     */
    @Override
    public int lancer(){
        return r.nextInt((this.nbr_face - this.borne_minimal) + 1) + this.borne_minimal;
    }
}
