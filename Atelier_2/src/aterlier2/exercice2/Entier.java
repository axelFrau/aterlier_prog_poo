package aterlier2.exercice2;

import aterlier2.exercice1.De;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Entier {

    protected int valeur;
    protected int borneInf;
    protected int borneSup;

    public Entier(int valeur, int borneInf,int borneSup){
        this.borneInf = borneInf;
        this.borneSup = borneSup;
        setValeur(valeur);
    }
    public Entier(int borneInf,int borneSup){
        this.borneInf = borneInf;
        this.borneSup = borneSup;
        setValeur(0);
    }

    public void setValeur(int valeur){
        if (valeur >= borneInf && valeur <= borneSup){
            this.valeur = valeur;
        } else {
            System.out.println("Bornes atteintes !");
        }
    }

    public int getValeur() {
        return this.valeur;
    }

    public int getBorneInf() {
        return this.borneInf;
    }

    public int getBorneSup() {
        return this.borneSup;
    }

    public ArrayList<Integer> getBornes() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(this.borneInf);
        list.add(this.borneSup);
        return list;
    }

    public void incremente(){
        int value = getValeur();
        int incremented = value + 1;
        setValeur(incremented);
    }

    public void incremente(int pas){
        int value = getValeur();
        int incremented = value + pas;
        setValeur(incremented);
    }

    @Override
    public String toString() {
        return "Valeur : "+ this.valeur + "\nBornes : " + this.borneInf +" et " + this.borneSup;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;
        if (obj == null || getClass() != obj.getClass()) {
            res = false;
        } else {
            ArrayList<Integer> bornes = this.getBornes();
            if (this == obj) res = true;
            Entier entier = (Entier) obj;
            if (bornes.get(0) == entier.getBorneInf() && bornes.get(1) == entier.getBorneSup() && this.valeur == entier.getValeur()){
                res = true;
            }
        }
        return res;
    }
}
