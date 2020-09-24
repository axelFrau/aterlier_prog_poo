package aterlier2.exercice_1;

public class De_memoire extends De {
    private int dernier_chiffre = -1;

    public De_memoire(int nbr_face, String nom) {
        super(nbr_face, nom);
    }

    public void setDernier_chiffre(int dernier_chiffre){
        this.dernier_chiffre = dernier_chiffre;
    }

    public int getDernier_chiffre() {
        return this.dernier_chiffre;
    }

    @Override
    public int lancer(){
        int rand_int;
        do {
            rand_int = r.nextInt(this.nbr_face) + 1;
        } while (rand_int == getDernier_chiffre());
        setDernier_chiffre(rand_int);
        return rand_int;
    }

}

