package aterlier2.exercice2;

import aterlier2.exercice1.De;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Entier {

    protected int valeur;
    protected int borneInf;
    protected int borneSup;

    /**
     * Constructor with value
     * @param valeur - int
     * @param borneInf - int
     * @param borneSup - int
     */
    public Entier(int valeur, int borneInf,int borneSup){
        this.borneInf = borneInf;
        this.borneSup = borneSup;
        setValeur(valeur);
    }

    /**
     * Constructor without Value
     * @param borneInf - int
     * @param borneSup - int
     */
    public Entier(int borneInf,int borneSup){
        this.borneInf = borneInf;
        this.borneSup = borneSup;
        setValeur(0);
    }

    /**
     * Setter for the value
     * @param valeur - int
     */
    public void setValeur(int valeur){
        if (valeur >= borneInf && valeur <= borneSup){
            this.valeur = valeur;
        } else {
            System.out.println("Bornes atteintes !");
        }
    }

    /**
     * Getter for value
     * @return value - int
     */
    public int getValeur() {
        return this.valeur;
    }

    /**
     * Getter BorneInf
     * @return borneInf  - int
     */
    public int getBorneInf() {
        return this.borneInf;
    }

    /**
     * getter for BorneSup
     * @return borneSup - int
     */
    public int getBorneSup() {
        return this.borneSup;
    }

    /**
     * function that returns a list of the two bornes
     * @return bornes - ArrayList<Interger>
     */
    public ArrayList<Integer> getBornes() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(this.borneInf);
        list.add(this.borneSup);
        return list;
    }

    /**
     * Increments the value by one
     */
    public void incremente(){
        int value = getValeur();
        int incremented = value + 1;
        setValeur(incremented);
    }

    /**
     * Increments the value by a specific amount
     * @param pas - int
     */
    public void incremente(int pas){
        int value = getValeur();
        int incremented = value + pas;
        setValeur(incremented);
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
            Entier entier = (Entier) obj;
            if (bornes.get(0) == entier.getBorneInf() && bornes.get(1) == entier.getBorneSup() && this.valeur == entier.getValeur()){
                res = true;
            }
        }
        return res;
    }
}
