package atelier3;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar date1 = new GregorianCalendar(2000,1,13);
        GregorianCalendar date2 = new GregorianCalendar(2003,5,21);
        GregorianCalendar date3 = new GregorianCalendar(2005,6,30);
        Personne p1 = new Personne("Frau","Axel",date1,new Adresse(2,"Rue St Antoine","20000","Ajaccio"));
        Personne p2 = new Personne("Ferricean","Johanna",date2,new Adresse(2,"Rue St Antoine","20000","Ajaccio"));
        Personne p3 = new Personne("Comiti","Ghuinevra",date3,new Adresse(2,"Rue St Antoine","20000","Ajaccio"));
        System.out.println(Personne.getCompteur()); // 3
        System.out.println(Personne.older(p1,p2)); //true
        System.out.println(p1.older(p2));//true
        System.out.println(p1.equals(p2)); //false
        GregorianCalendar dateEmbauche = new GregorianCalendar(2018,1,20);
        Employe e1 = Employe.createEmploye("Frau","Axel",date1,
                new Adresse(2,"Rue St Antoine",
                "20000","Ajaccio"),1300,dateEmbauche);
        System.out.println(e1.toString());
        System.out.println(e1.calculAnnuite());

        Secretaire se1 = new Secretaire("Rutily", "Léa",
                new GregorianCalendar(2000,5,10),
                new Adresse("20000", "Ajaccio"),1500,
                new GregorianCalendar(2019,1,2));
        Manager ma1 = new Manager("Frau", "Axel",
                date1,new Adresse("20000","Ajaccio"),
                2200,new GregorianCalendar(2017,1,12));
        ma1.setSecretaire(se1);
//        System.out.println("Le manager : " + ma1.getPrenom() + " a pour secrétaire : " + ma1.getSecretaire().getPrenom() +" "+ ma1.getSecretaire().getNom());
//        System.out.println("La secretaire : " + se1.getPrenom() + " est affecter au manager : " + se1.getManager().getPrenom() +" "+ se1.getManager().getNom());
//        System.out.println(se1.equals(se1));
//        System.out.println(ma1.getSalaire());
    }
}
