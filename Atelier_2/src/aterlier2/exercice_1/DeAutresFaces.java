package aterlier2.exercice_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DeAutresFaces extends De{
    private ArrayList<Object> listForDice = new ArrayList<Object>();

    /**
     *
     * @param nom - String
     * @param listForDice - ArrayList<Object>
     */
    public DeAutresFaces(String nom, ArrayList<Object> listForDice){
        super(listForDice.size(),nom);
        setListDeMots(listForDice);
    }

    /**
     *
     * @param list - ArrayList<Object>
     */
    private void setListDeMots(ArrayList<Object> list){
        this.listForDice = list;
    }

    /**
     *
     * @return List - listForDice
     */
    public List getListForDice(){
        return this.listForDice;
    }

    /**
     *
     * @return int - size of listForDice
     */
    public int getListForDiceSize(){
        return this.listForDice.size();
    }

    /**
     *
     * @return Object - Random element of ListForDice
     */
    public Object lancerAutre(){
        int randomInt = super.lancer();
        return this.listForDice.get(randomInt);
    }

    /**
     *
     * @param nbrLancer - int
     */
    public void lancerAutre(int nbrLancer){
        for (int i = 0; i < nbrLancer; i++) {
            String randomOutPut = this.lancerAutre().toString();
            System.out.print("Lancer "+(i+1)+" : "+ randomOutPut + "\n");
        }
    }
}
