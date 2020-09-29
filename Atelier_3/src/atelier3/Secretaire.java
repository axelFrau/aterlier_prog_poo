package atelier3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Secretaire extends Employe{

    private ArrayList<Manager> managers;

    public Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche){
        super(leNom,lePrenom,laDate,lAdresse,salaire,dateEmbauche);
    }

    public void salaireSecretaire(){
        int employerListSize = this.managers.size();
        double raise = 0.1 * employerListSize;
        this.augmenterLeSalaire(raise);
    }

    public ArrayList<Manager> getManagers(){ return this.managers; }

    public void addManager(Manager manager){
        if(this.managers.size() < 5){
            this.managers.add(manager);
            salaireSecretaire();
        } else {
            System.out.println("Cette secrétaire a déja 5 Manager affectés");
        }
    }
    public void delManager(Manager manager){
        this.managers.remove(manager);
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;
        if (obj == null || getClass() != obj.getClass()) {
            res = false;
        } else {
            if (this == obj) res = true;
            Secretaire s = (Secretaire) obj;
            if (this.getNom() == s.getNom() && this.getPrenom() == s.getPrenom() && this.getDateNaissance() == s.getDateNaissance()) {
                res = true;
            }
        }
        return res;
    }
}
