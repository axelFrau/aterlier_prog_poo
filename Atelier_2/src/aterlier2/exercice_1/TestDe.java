package aterlier2.exercice_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class TestDe {
    public static void main(String[] args) {
        De monDeDefault = new De();
        De monDeDynamique = new De(120, "Dé 120");
        DePipe monDePipe = new DePipe(120,"De Pipé 120", 100);
        DeMemoire monDeMemoire = new DeMemoire(3,"De 3 mémoire");
        ArrayList listeForDice = new ArrayList<>();
        listeForDice.add("Oui");
        listeForDice.add("Non");
        listeForDice.add("Fonce !");
        listeForDice.add("Surtout pas !");
        DeAutresFaces monDeAutreFace = new DeAutresFaces("Dé Autre Face", listeForDice);
        int listLenght = monDeAutreFace.getListForDiceSize();
        ArrayList<Object> listeForDiceInListForDice = new ArrayList<Object>();
        for (int i = 0; i < listLenght; i++) {
            listeForDiceInListForDice.add(i);
        }
        listeForDice.add(listeForDiceInListForDice);
        monDeAutreFace.lancerAutre(100);
//        System.out.println("Dé par défault : " + monDeDefault);
//        System.out.println("Dé par dynamique : " +monDeDynamique.nbr_face + "\nSon nom est : "+monDeDynamique.nom);
//        System.out.println("Résultat du lancer de dé : "+monDeDynamique.lancer());
//        System.out.println("Meilleur résultat des lancers consécutifs : " + monDePipe.lancer(100));
//        System.out.println(monDeDefault.toString());
//        System.out.println(monDeDynamique.toString());
//        System.out.println(mon_de_default.equals(monDeDefault));
//        System.out.println(monDePipe.lancer());
//        System.out.println(mon_de_memoire.lancer(100));
    }
}
