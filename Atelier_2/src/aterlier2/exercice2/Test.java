package aterlier2.exercice2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Entier un = new Entier(1,0,10);
        ArrayList<Integer> bornes = un.getBornes();
//        System.out.println("Borne inférieure : "+bornes.get(0) + " borne supérieure : " + bornes.get(1));
//        System.out.println(un.toString());
//        System.out.println(un.equals(un));
        EntierFou entierFou = new EntierFou(1,0,50,5);
//        System.out.println(entierFou.getValeur());
//        for (int i = 0; i < 20; i++) {
//            entierFou.incremente();
//            System.out.println(entierFou.getValeur());
//        }

    }
}
