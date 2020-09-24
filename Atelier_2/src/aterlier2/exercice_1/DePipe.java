package aterlier2.exercice_1;

public class DePipe extends De{
    private int borneMinimal;

    /**
     * Constructor for dePipe object
     * @param nbrFace int
     * @param nom String
     * @param borneMinimale int
     */
    public DePipe(int nbrFace, String nom, int borneMinimale){
        super(nbrFace,nom);
        setBorneMinimal(borneMinimale);
    }

    /**
     *Setter for borneMinimal
     * @param borneMinimal int
     */
    public void setBorneMinimal(int borneMinimal){
        if (this.nbrFace < borneMinimal) {
            this.borneMinimal = nbrFace;
        } else {
            this.borneMinimal = borneMinimal;
        }

    }

    /**
     * Getter for the borneMinimal
     * @return int
     */
    public int getBorneMinimal(){
        return borneMinimal;
    }

    /**
     * Lance le dé pipé et renvoie un chiffre entre la borne fixé et le nbr de face
     * @return int
     */
    @Override
    public int lancer(){
        return r.nextInt((this.nbrFace - this.borneMinimal) + 1) + this.borneMinimal;
    }
}
