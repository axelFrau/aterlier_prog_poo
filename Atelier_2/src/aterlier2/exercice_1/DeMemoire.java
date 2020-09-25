package aterlier2.exercice_1;

public class DeMemoire extends De {
    private int dernierChiffre = -1;

    public DeMemoire(int nbrFace, String nom) {
        super(nbrFace, nom);
    }

    public void setDernierChiffre(int dernierChiffre){
        this.dernierChiffre = dernierChiffre;
    }

    public int getDernierChiffre() {
        return this.dernierChiffre;
    }

    @Override
    public int lancer(){
        int randInt;
        do {
            randInt = super.lancer();
        } while (randInt == getDernierChiffre());
        setDernierChiffre(randInt);
        return randInt;
    }

}

