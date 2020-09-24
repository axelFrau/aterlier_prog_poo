package aterlier2.exercice_1;

public class Test_De {
    public static void main(String[] args) {
        De mon_de_default = new De();
        De mon_de_dynamique = new De(120, "Dé 120");
        De mon_de_pipe = new De_pipe(120,"De Pipé 120", 100);
        De mon_de_memoire = new De_memoire(3,"De 3 mémoire");
//        System.out.println("Dé par défault : " + mon_de_default.nbr_face);
//        System.out.println("Dé par dynamique : " +mon_de_dynamique.nbr_face + "\nSon nom est : "+mon_de_dynamique.nom);
//        System.out.println("Résultat du lancer de dé : "+mon_de_dynamique.lancer());
//        System.out.println("Meilleur résultat des lancers consécutifs : " + mon_de_pipe.lancer(100));
//        System.out.println(mon_de_default.toString());
//        System.out.println(mon_de_dynamique.toString());
//        System.out.println(mon_de_default.equals(mon_de_default));
//        System.out.println(mon_de_pipe.lancer());
//        System.out.println(mon_de_memoire.lancer(100));
    }
}
