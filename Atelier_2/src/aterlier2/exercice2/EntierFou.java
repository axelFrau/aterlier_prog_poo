package aterlier2.exercice2;
import java.util.*;

public class EntierFou extends Entier{

    public static Random r = new Random();
    private int niveauDeFolie;

    public EntierFou(int valeur, int borneInf,int borneSup,int niveauDeFolie) {
        super(valeur, borneInf, borneSup);
        this.niveauDeFolie = niveauDeFolie;
    }

    @Override
    public void incremente(){
        int random = r.nextInt(this.niveauDeFolie + 1) + 0;
        super.incremente(random);
    }

}
