package aterlier2.exercice_1;

public class TestDe {
    public static void main(String[] args) {
        De monDeDefault = new De();
        De monDeDynamique = new De(120, "Dé 120");
        De monDePipe = new DePipe(120,"De Pipé 120", 100);
        De monDeMemoire = new DeMemoire(3,"De 3 mémoire");
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
